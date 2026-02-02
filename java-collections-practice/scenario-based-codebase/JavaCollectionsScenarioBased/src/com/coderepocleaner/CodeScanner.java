package com.coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class CodeScanner {

    private static final String METHOD_REGEX =
            "void\\s+[A-Z_]+\\s*\\(";  // bad method name (not camelCase)

    private static final String IMPORT_REGEX =
            "import\\s+([a-zA-Z0-9_.]+);";

    public static Map<FileType, List<File>> scanFolder(String rootPath) throws IOException {

        Map<FileType, List<File>> map = new HashMap<>();
        map.put(FileType.VALID, new ArrayList<>());
        map.put(FileType.WARNINGS, new ArrayList<>());
        map.put(FileType.ERRORS, new ArrayList<>());

        List<Path> javaFiles;

        try (Stream<Path> paths = Files.walk(Paths.get(rootPath))) {
            javaFiles = paths
                    .filter(p -> p.toString().endsWith(".java"))
                    .collect(Collectors.toList());
        }

        for (Path path : javaFiles) {
            File file = path.toFile();
            String content = new String(Files.readAllBytes(path));

            boolean badMethod = hasBadMethodName(content);
            boolean unusedImport = hasUnusedImport(content);

            if (badMethod) {
                map.get(FileType.ERRORS).add(file);
            } else if (unusedImport) {
                map.get(FileType.WARNINGS).add(file);
            } else {
                map.get(FileType.VALID).add(file);
            }
        }

        return map;
    }

    private static boolean hasBadMethodName(String content) {
        return Pattern.compile(METHOD_REGEX).matcher(content).find();
    }

    private static boolean hasUnusedImport(String content) {
        Matcher m = Pattern.compile(IMPORT_REGEX).matcher(content);
        Set<String> imports = new HashSet<>();

        while (m.find()) {
            imports.add(m.group(1)
                    .substring(m.group(1).lastIndexOf('.') + 1));
        }

        for (String imp : imports) {
            if (!content.contains(imp)) {
                return true;
            }
        }
        return false;
    }
}

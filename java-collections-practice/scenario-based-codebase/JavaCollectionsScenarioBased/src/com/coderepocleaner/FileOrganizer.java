package com.coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileOrganizer {

    public static void organize(Map<FileType, List<File>> map, String basePath)
            throws IOException {

        for (Map.Entry<FileType, List<File>> entry : map.entrySet()) {

            Path folder = Paths.get(basePath, entry.getKey().name());
            Files.createDirectories(folder);

            for (File file : entry.getValue()) {
                Files.move(file.toPath(),
                        folder.resolve(file.getName()),
                        StandardCopyOption.REPLACE_EXISTING);
            }
        }
    }
}

package com.resumeanalyzer;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ResumeAnalyzer {

    private static final String EMAIL_REGEX = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

    private static final String PHONE_REGEX = "\\b\\d{10}\\b";

    private static final String[] KEYWORDS = {"Java", "Python", "Spring"};

    public static Map<String, ResumeData> processFolder(String path) {

        Map<String, ResumeData> resumeMap = new HashMap<>();
        File folder = new File(path);

        File[] files = folder.listFiles();
        if (files == null) return resumeMap;

        for (File file : files) 
        {
            try 
            {
                if (!file.getName().endsWith(".txt")) 
                {
                    throw new IllegalArgumentException("Invalid file format");
                }

                String content = readFile(file);

                String email = extract(content, EMAIL_REGEX);
                String phone = extract(content, PHONE_REGEX);

                List<String> matchedKeywords = findKeywords(content);

                ResumeData data = new ResumeData(email, phone, matchedKeywords);

                resumeMap.put(email, data);

            } 
            catch (Exception e) 
            {
                System.out.println("Skipping: " + file.getName() + " -> " + e.getMessage());
            }
        }

        return resumeMap;
    }

    private static String readFile(File file) throws IOException 
    {
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) 
        {
            sb.append(line).append(" ");
        }
        br.close();
        return sb.toString();
    }

    private static String extract(String text, String regex) {
        Matcher m = Pattern.compile(regex).matcher(text);
        return m.find() ? m.group() : "Not Found";
    }

    private static List<String> findKeywords(String text) 
    {
        List<String> list = new ArrayList<>();

        for (String key : KEYWORDS) 
        {
            Pattern p = Pattern.compile(key, Pattern.CASE_INSENSITIVE);
            if (p.matcher(text).find()) 
            {
                list.add(key);
            }
        }
        return list;
    }
}

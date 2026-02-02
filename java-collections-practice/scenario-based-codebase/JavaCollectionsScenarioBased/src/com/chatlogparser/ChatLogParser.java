package com.chatlogparser;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ChatLogParser {

    private static final String REGEX = "\\[(.*?)\\]\\s+(.*?):\\s+(.*)";

    public static Map<String, List<String>> parseChat(String filePath,MessageFilter<String> filter) throws IOException {

        Map<String, List<String>> map = new TreeMap<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        Pattern pattern = Pattern.compile(REGEX);

        while ((line = br.readLine()) != null) 
        {
            Matcher m = pattern.matcher(line);

            if (m.find()) 
            {
                String time = m.group(1);
                String user = m.group(2);
                String message = m.group(3);

                if (!filter.filter(message)) continue;

                map.computeIfAbsent(user, k -> new ArrayList<>()).add("[" + time + "] " + message);
            }
        }

        br.close();
        return map;
    }
}

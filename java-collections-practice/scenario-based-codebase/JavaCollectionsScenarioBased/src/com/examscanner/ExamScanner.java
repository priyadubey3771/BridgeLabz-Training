package com.examscanner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamScanner {

    // Name followed by only A-D answers
    private static final String LINE_REGEX =
            "^[A-Za-z ]+(,[A-D])+$";

    public static <T extends AnswerSheet<String>> Map<String, Integer>
    evaluate(String filePath, List<String> answerKey, String subject)
            throws IOException {

        Map<String, Integer> scoreMap = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = br.readLine()) != null) {
            try {
                if (!Pattern.matches(LINE_REGEX, line)) {
                    throw new IllegalArgumentException("Invalid format");
                }

                String[] parts = line.split(",");
                String name = parts[0];
                List<String> answers =
                        Arrays.asList(Arrays.copyOfRange(parts, 1, parts.length));

                AnswerSheet<String> sheet;

                // Generics in action
                if (subject.equalsIgnoreCase("Math")) {
                    sheet = new MathAnswerSheet(name, answers);
                } else {
                    sheet = new ScienceAnswerSheet(name, answers);
                }

                int score = calculateScore(sheet, answerKey);
                scoreMap.put(name, score);

            } catch (Exception e) {
                System.out.println("Skipping invalid line: " + line);
            }
        }

        br.close();
        return scoreMap;
    }

    private static int calculateScore(
            AnswerSheet<String> sheet,
            List<String> key) {

        int score = 0;

        for (int i = 0; i < key.size() && i < sheet.getAnswers().size(); i++) {
            if (key.get(i).equals(sheet.getAnswers().get(i))) {
                score++;
            }
        }
        return score;
    }
}

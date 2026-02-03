package com.json.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJsonDriver {
    public static void main(String[] args) {
        String json = "{\"name\":\"Priya\",\"age\":22}";

        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readTree(json);
            System.out.println("Valid JSON");
        } catch (Exception e) {
            System.out.println("Invalid JSON: " + e.getMessage());
        }
    }
}

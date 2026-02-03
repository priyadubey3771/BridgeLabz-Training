package com.json.practiceproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJsonDriver {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        String json1 = "{\"name\":\"Priya\", \"age\":22}";
        String json2 = "{\"email\":\"priya@example.com\", \"city\":\"Delhi\"}";

        JsonNode node1 = mapper.readTree(json1);
        JsonNode node2 = mapper.readTree(json2);

        ((ObjectNode) node1).setAll((ObjectNode) node2);

        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(node1));
    }
}

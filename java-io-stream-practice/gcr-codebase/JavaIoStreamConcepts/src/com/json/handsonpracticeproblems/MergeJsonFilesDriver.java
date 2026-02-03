package com.json.handsonpracticeproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;

public class MergeJsonFilesDriver {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        JsonNode json1 = mapper.readTree(new File("file1.json"));
        JsonNode json2 = mapper.readTree(new File("file2.json"));

        ((ObjectNode) json1).setAll((ObjectNode) json2);

        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json1));
    }
}

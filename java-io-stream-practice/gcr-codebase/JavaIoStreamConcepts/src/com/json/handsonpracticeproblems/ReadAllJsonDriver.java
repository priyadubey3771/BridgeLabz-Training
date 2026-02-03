package com.json.handsonpracticeproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class ReadAllJsonDriver {
    public static void main(String[] args) throws Exception {
    	
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("users.json"));

        for (JsonNode node : root)
        {
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
            while (fields.hasNext()) 
            {
                Map.Entry<String, JsonNode> field = fields.next();
                System.out.println(field.getKey() + " : " + field.getValue().asText());
            }
            System.out.println("-----------");
        }
    }
}

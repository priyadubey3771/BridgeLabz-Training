package com.json.handsonpracticeproblems;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonToXmlDriver {
    public static void main(String[] args) throws Exception {

        String jsonArray = "[{\"name\":\"Priya\",\"age\":22},{\"name\":\"Amit\",\"age\":28}]";

        ObjectMapper jsonMapper = new ObjectMapper();
        JsonNode arrayNode = jsonMapper.readTree(jsonArray);

        // Wrap array inside a root object
        ObjectNode root = jsonMapper.createObjectNode();
        root.set("users", arrayNode);

        XmlMapper xmlMapper = new XmlMapper();

        String xml = xmlMapper.writerWithDefaultPrettyPrinter()
                              .writeValueAsString(root);

        System.out.println(xml);
    }
}

package com.json.handsonpracticeproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;
import java.util.Set;

public class ValidateEmailDriver {
    public static void main(String[] args) throws Exception {
        String json = "{ \"email\": \"priya@example.com\" }";
        String schemaJson = "{\n" +
                "  \"$schema\": \"http://json-schema.org/draft-07/schema#\",\n" +
                "  \"type\": \"object\",\n" +
                "  \"properties\": {\n" +
                "    \"email\": {\n" +
                "      \"type\": \"string\",\n" +
                "      \"format\": \"email\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"required\": [\"email\"]\n" +
                "}";

        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(json);
        JsonNode schemaNode = mapper.readTree(schemaJson);

        // ⚡ Updated line for new NetworkNT versions
        JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);
        JsonSchema schema = factory.getSchema(schemaNode);

        Set<ValidationMessage> errors = schema.validate(jsonNode);
        if (errors.isEmpty()) {
            System.out.println("Valid email");
        } else {
            errors.forEach(System.out::println);
        }
    }
}

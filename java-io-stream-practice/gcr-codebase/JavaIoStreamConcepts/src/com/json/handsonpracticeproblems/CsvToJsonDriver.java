package com.json.handsonpracticeproblems;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper; // <--- ADD THIS
import java.io.File;
import java.util.List;
import java.util.Map;

public class CsvToJsonDriver {
    public static void main(String[] args) throws Exception {

        CsvMapper mapper = new CsvMapper();

        // CSV schema with header
        CsvSchema schema = CsvSchema.emptySchema().withHeader();

        // MappingIterator reads each row as a Map
        MappingIterator<Map<String, String>> it =
                mapper.readerFor(Map.class)
                      .with(schema)
                      .readValues(new File("ipl.csv"));

        List<Map<String, String>> data = it.readAll();

        // Convert list of maps to JSON
        ObjectMapper jsonMapper = new ObjectMapper();
        String json = jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(data);

        System.out.println(json);
    }
}


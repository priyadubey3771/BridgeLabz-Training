package com.json.iplandcensoranalyzer;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.util.List;
import java.util.Map;

public class CsvProcessor {

    public static void processCsv() throws Exception {

        CsvMapper mapper = new CsvMapper();

        // 1️⃣ Read CSV file into List of Maps
        CsvSchema readSchema = CsvSchema.emptySchema().withHeader();
        MappingIterator<Map<String, String>> it =
                mapper.readerFor(Map.class)
                      .with(readSchema)
                      .readValues(new File("ipl.csv"));

        List<Map<String, String>> rows = it.readAll();

        // 2️⃣ Apply censorship rules
        for (Map<String, String> row : rows) {
            row.put("team1", CensorUtil.maskTeamName(row.get("team1")));
            row.put("team2", CensorUtil.maskTeamName(row.get("team2")));
            row.put("winner", CensorUtil.maskTeamName(row.get("winner")));
            row.put("player_of_match", CensorUtil.redactPlayer());
        }

        // 3️⃣ Build CSV schema from map keys for writing
        CsvSchema.Builder builder = CsvSchema.builder();
        for (String col : rows.get(0).keySet()) {
            builder.addColumn(col);
        }
        CsvSchema writeSchema = builder.build().withHeader();

        // 4️⃣ Write censored CSV to file
        mapper.writer(writeSchema)
              .writeValue(new File("ipl_censored.csv"), rows);

        System.out.println("CSV censorship complete. Output file: ipl_censored.csv");
    }
}

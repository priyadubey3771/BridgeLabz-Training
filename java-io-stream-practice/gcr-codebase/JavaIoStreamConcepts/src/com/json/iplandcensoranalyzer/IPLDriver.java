package com.json.iplandcensoranalyzer;

public class IPLDriver {
    public static void main(String[] args) throws Exception {

        JsonProcessor.processJson();
        CsvProcessor.processCsv();

        System.out.println("Censorship completed. Check output files.");
    }
}


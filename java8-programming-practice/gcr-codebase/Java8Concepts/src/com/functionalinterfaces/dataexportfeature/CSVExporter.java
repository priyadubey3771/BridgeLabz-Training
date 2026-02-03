package com.functionalinterfaces.dataexportfeature;

public class CSVExporter implements ReportExporter {

    @Override
    public void export(String data) 
    {
        System.out.println("Exporting data to CSV: " + data);
    }
}

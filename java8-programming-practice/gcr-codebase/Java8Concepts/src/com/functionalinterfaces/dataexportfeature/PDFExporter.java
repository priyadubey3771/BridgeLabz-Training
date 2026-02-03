package com.functionalinterfaces.dataexportfeature;

public class PDFExporter implements ReportExporter {

    @Override
    public void export(String data) 
    {
        System.out.println("Exporting data to PDF: " + data);
    }
}

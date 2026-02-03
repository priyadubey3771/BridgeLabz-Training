package com.functionalinterfaces.dataexportfeature;

public class Driver {
  public static void main(String[] args) {

        ReportExporter csv = new CSVExporter();
        ReportExporter pdf = new PDFExporter();

        csv.export("Report Data");
        csv.exportToJSON("Report Data");  

        pdf.export("Report Data");
        pdf.exportToJSON("Report Data");  
        
    }
}

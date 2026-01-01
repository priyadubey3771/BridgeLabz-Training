package com.objectmodeling;

public class CompanyCompositionDriver {
  public static void main(String[] args) {

     // Creating Company
     Company company = new Company("Tech Solutions Pvt Ltd");

     // Creating Departments
     Department itDept = new Department("IT Department");
     Department hrDept = new Department("HR Department");

     // Adding employees to departments
     itDept.addEmployee("Priya Dubey", 101);
     itDept.addEmployee("Amit Sharma", 102);
     hrDept.addEmployee("Neha Verma", 201);

     // Adding departments to company
     company.addDepartment(itDept);
     company.addDepartment(hrDept);

     // Displaying company structure
     company.displayCompanyDetails();

     // Deleting company
     company.deleteCompany();
 }
}

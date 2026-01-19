package com.aidrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class Driver {
  public static void main(String[] args) {

        // creating job roles
        SoftwareEngineer se = new SoftwareEngineer();
        DataScientist ds = new DataScientist();
        ProductManager pm = new ProductManager();

        // creating resumes for different roles
        Resume<SoftwareEngineer> r1 = new Resume<>("Amit", 3, se);
        Resume<DataScientist> r2 =  new Resume<>("Neha", 2, ds);
         Resume<ProductManager> r3 =  new Resume<>("Rahul", 6, pm);

        // screening individual resumes
        ResumeScreeningUtil.screenResume(r1);
        ResumeScreeningUtil.screenResume(r2);
        ResumeScreeningUtil.screenResume(r3);

        // processing job roles dynamically
        List<JobRole> roles = new ArrayList<>();
        roles.add(se);
        roles.add(ds);
        roles.add(pm);

        ResumeScreeningUtil.processJobRoles(roles);
    }
}

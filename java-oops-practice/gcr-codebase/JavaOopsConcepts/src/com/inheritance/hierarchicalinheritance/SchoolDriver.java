package com.inheritance.hierarchicalinheritance;

public class SchoolDriver {
   public static void main(String[] args) {

        Person p1 = new Teacher("Mr. Sharma", 40, "Mathematics");
        Person p2 = new Student("Anita", 16, "10th Grade");
        Person p3 = new Staff("Ramesh", 45, "Administration");

        Person[] people = { p1, p2, p3 };

        for (Person p : people) 
        {
            System.out.println("--------------------------");

            if (p instanceof Teacher) 
            {
                ((Teacher) p).displayInfo();
            } 
            else if (p instanceof Student) 
            {
                ((Student) p).displayInfo();
            } 
            else if(p instanceof Staff) 
            {
                ((Staff) p).displayInfo();
            }
        }
    }
}

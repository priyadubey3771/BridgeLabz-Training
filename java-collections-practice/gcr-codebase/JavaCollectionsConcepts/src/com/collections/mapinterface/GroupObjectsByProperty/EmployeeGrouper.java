package com.collections.mapinterface.GroupObjectsByProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Class to group employees by department
public class EmployeeGrouper {

    public Map<String, List<Employee>> groupByDepartment(List<Employee> employees) 
    {
    	Map<String, List<Employee>> groupedMap = new HashMap<>();

        for (Employee emp : employees) 
        {
            String dept = emp.getDepartment();

            // adding employee to list corresponding to department
            groupedMap.computeIfAbsent(dept, k -> new ArrayList<>()).add(emp);
            
        }

        return groupedMap;
        
    }
}

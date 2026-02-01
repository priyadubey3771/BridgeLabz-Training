package com.reflection.createcustomobjectmapper;

import java.util.HashMap;
import java.util.Map;

public class Driver {
  public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();
        map.put("id", 101);
        map.put("name", "Priya");
        map.put("marks", 89.5);

        Student student = ObjectMapperUtil.toObject(Student.class, map);
        System.out.println(student);
    }
}

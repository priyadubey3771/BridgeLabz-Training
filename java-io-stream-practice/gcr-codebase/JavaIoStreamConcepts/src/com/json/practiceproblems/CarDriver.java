package com.json.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CarDriver {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        Car car = new Car();
        car.setMake("Toyota");
        car.setModel("Corolla");
        car.setYear(2025);

        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(car));
    }
}

class Car {
    private String make;
    private String model;
    private int year;

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
}

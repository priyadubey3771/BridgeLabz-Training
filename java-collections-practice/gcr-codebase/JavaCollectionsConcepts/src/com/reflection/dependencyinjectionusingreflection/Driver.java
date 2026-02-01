package com.reflection.dependencyinjectionusingreflection;

public class Driver {
  public static void main(String[] args) {

        Car car = SimpleDIContainer.getInstance(Car.class);
        car.drive();
        
    }
}

package com.streamapi.hospitaldoctoravailability;

import java.util.*;
import java.util.stream.*;

public class DoctorDriver {
  public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Sharma", "Cardiology", true),
            new Doctor("Dr. Verma", "Neurology", false),
            new Doctor("Dr. Singh", "Orthopedics", true),
            new Doctor("Dr. Patel", "Dermatology", true),
            new Doctor("Dr. Khan", "Pediatrics", false),
            new Doctor("Dr. Rao", "Cardiology", true),
            new Doctor("Dr. Mehta", "Gynecology", true)
        );

        List<Doctor> availableDoctors = doctors.stream()

            //filter weekend availability
            .filter(Doctor::isAvailableOnWeekend)

            //sort by specialty alphabetically
            .sorted(Comparator.comparing(Doctor::getSpecialty))

            //collect
            .collect(Collectors.toList());

        System.out.println("Doctors Available on Weekends (Sorted by Specialty):");
        availableDoctors.forEach(System.out::println);
    }
}

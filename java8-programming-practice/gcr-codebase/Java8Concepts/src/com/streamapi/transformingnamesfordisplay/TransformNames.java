package com.streamapi.transformingnamesfordisplay;

import java.util.*;
import java.util.stream.*;

public class TransformNames {
   public static void main(String[] args) {

        List<String> names = Arrays.asList("rahul","priya","amit","sneha","karan","anita");

        List<String> formattedNames = names.stream()

            //convert to uppercase
            .map(String::toUpperCase)

            //sort alphabetically
            .sorted()

            // collect
            .collect(Collectors.toList());

        System.out.println("Formatted Names:");
        formattedNames.forEach(System.out::println);
    }
}

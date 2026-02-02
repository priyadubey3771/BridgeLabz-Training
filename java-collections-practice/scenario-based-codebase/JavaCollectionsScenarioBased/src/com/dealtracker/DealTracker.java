package com.dealtracker;

import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.regex.*;

public class DealTracker {

    private static final String CODE = "DealCode: (.*)";
    private static final String DATE = "ValidTill: (\\d{2}-\\d{2}-\\d{4})";
    private static final String DISCOUNT = "Discount: (\\d+)%";
    private static final String MIN = "MinimumPurchase: (\\d+)";

    public static Map<String, Deal> loadDeals(String folderPath)throws Exception 
    {
    	Map<String, Deal> dealMap = new HashMap<>();
        Set<String> codes = new HashSet<>();

        File folder = new File(folderPath);

        for (File file : folder.listFiles()) 
        {
        	FileInputStream fis = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            String line, code = "";
            int discount = 0, min = 0;
            LocalDate date = null;

            while ((line = br.readLine()) != null) 
            {

                if (line.matches(CODE))
                {
                    code = line.replaceAll(CODE, "$1");
                }

                else if (line.matches(DATE)) 
                {
                    String d = line.replaceAll(DATE, "$1");
                    date = LocalDate.parse(d,
                            DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                }

                else if (line.matches(DISCOUNT))
                {
                    discount = Integer.parseInt(line.replaceAll(DISCOUNT, "$1"));
                }

                else if (line.matches(MIN))
                {
                    min = Integer.parseInt(line.replaceAll(MIN, "$1"));
                }
            }

            br.close();

            if (codes.contains(code)) continue;

            if (date.isBefore(LocalDate.now())) continue;

            Deal deal = new Deal(code, discount, date, min);
            dealMap.put(code, deal);
            codes.add(code);
        }

        return dealMap;
    }
}

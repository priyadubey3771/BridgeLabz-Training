package com.streamapi.stockpricelogger;

import java.util.*;
import java.util.stream.*;

public class StockPriceLogger {
   public static void main(String[] args) {

        List<Double> stockPrices = Arrays.asList(245.50,247.30,246.10,248.90,249.75);
        System.out.println("Live Stock Price Updates:");

        stockPrices.stream().forEach(price ->System.out.println("Current Price: ₹" + price));
        
    }
}

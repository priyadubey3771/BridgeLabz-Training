package com.stackandqueue.stockSpanProblem;

import java.util.Arrays;
public class Driver {
   public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        StockSpan stockSpan = new StockSpan();
        int[] span = stockSpan.calculateSpan(prices);

        System.out.println("Stock prices: " + Arrays.toString(prices));
        System.out.println("Span array:    " + Arrays.toString(span));
    }
}

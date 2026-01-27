package com.exceptionhandling.multiplecatchblock;

public class Driver{
    public static void main(String[] args){
    	
        ArrayHandler ah = new ArrayHandler();

        int[] numbers = {10, 20, 30, 40, 50};

        ah.getValueAtIndex(numbers, 2);   
        ah.getValueAtIndex(numbers, 10);  
        ah.getValueAtIndex(null, 1);     
    }
}

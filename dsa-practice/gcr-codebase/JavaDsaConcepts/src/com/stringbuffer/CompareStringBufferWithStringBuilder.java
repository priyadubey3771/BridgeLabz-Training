package com.stringbuffer;

public class CompareStringBufferWithStringBuilder {
   public static void main(String[] args) {

    int n = 1000000;

    // StringBuffer Test
    StringBuffer stringBuffer = new StringBuffer();

    long startBuffer = System.nanoTime();
    for (int i = 0; i < n; i++) 
    {
        stringBuffer.append("hello");
    }
    
    long endBuffer = System.nanoTime();
    long bufferTime = endBuffer - startBuffer;

    // StringBuilder Test
    StringBuilder stringBuilder = new StringBuilder();

    long startBuilder = System.nanoTime();
    for (int i = 0; i < n; i++) 
    {
        stringBuilder.append("hello");
    }
    
    long endBuilder = System.nanoTime();
    long builderTime = endBuilder - startBuilder;

    //Output
    System.out.println("Time taken by StringBuffer (nanoseconds): " + bufferTime);
    System.out.println("Time taken by StringBuilder (nanoseconds): " + builderTime);
	    
   }
	
}




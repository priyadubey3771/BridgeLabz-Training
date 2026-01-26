package com.javastreams.bytearraystreams;

public class Driver{
    public static void main(String[] args){
    	
        ImageByteHandler ibh = new ImageByteHandler();

        String sourceImage = "C:\\Users\\hp\\Downloads\\1715141458664 (1).jpeg";
        String destinationImage = "C:/Users/hp/Downloads/sample_copy.jpg";

        ibh.convertImageToByteArray(sourceImage, destinationImage);
    }
}

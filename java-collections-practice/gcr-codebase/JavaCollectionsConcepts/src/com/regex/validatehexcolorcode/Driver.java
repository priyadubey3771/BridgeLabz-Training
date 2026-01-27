package com.regex.validatehexcolorcode;

public class Driver{
    public static void main(String[] args){
    	
        HexColorValidator hcv = new HexColorValidator();

        // Valid
        hcv.validateHexColor("#FFA500");  
        // Valid
        hcv.validateHexColor("#ff4500"); 
        // Invalid
        hcv.validateHexColor("#123");     
        // Invalid
        hcv.validateHexColor("FFA500");   
    }
}

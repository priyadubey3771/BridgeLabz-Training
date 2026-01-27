package com.regex.replacemultiplespaceswithsinglespace;

public class Driver{
   public static void main(String[] args){
    	
        SpaceNormalizer sn = new SpaceNormalizer();

        String text = "This  is  an   example   with   multiple spaces.";
        sn.normalizeSpaces(text);
    }
}

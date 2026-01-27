package com.regex.extractlinkfromwebpage;

public class Driver{
  public static void main(String[] args){
    	
        LinkExtractor le = new LinkExtractor();
        String text = "Visit https://www.google.com and http://example.org for more info.";
        le.extractLinks(text);
        
    }
}

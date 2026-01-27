package com.regex.replacemultiplespaceswithsinglespace;

import java.util.regex.Pattern;

class SpaceNormalizer
{
    void normalizeSpaces(String text)
    {
        String normalized = text.replaceAll("\\s+", " ");
        System.out.println("Normalized text:");
        System.out.println(normalized);
        
    }
}

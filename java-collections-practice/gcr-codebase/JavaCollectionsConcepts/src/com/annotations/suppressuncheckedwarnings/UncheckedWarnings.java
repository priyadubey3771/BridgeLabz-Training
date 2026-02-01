package com.annotations.suppressuncheckedwarnings;

import java.util.ArrayList;

public class UncheckedWarnings {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) 
    {

        // ArrayList without generics 
        ArrayList list = new ArrayList();

        list.add("Priya");
        list.add(100);
        list.add(45.6);

        for (Object obj : list) 
        {
            System.out.println(obj);
        }
    }
}

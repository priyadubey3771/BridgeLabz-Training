package com.coderepocleaner;

import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) throws Exception {

        String root = "javarepo";  // folder with many java files

        Map<FileType, List<File>> result = CodeScanner.scanFolder(root);

        FileOrganizer.organize(result, root);

        System.out.println("Cleaning completed!");
    }
}

package com.javastreams.bufferedstreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

class BufferedFileHandler
{
    // Copy file using normal FileInputStream/FileOutputStream
    void copyFileNormal(String sourceFile, String destinationFile)
    {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try
        {
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destinationFile);

            int data;
            long startTime = System.nanoTime();

            while ((data = fis.read()) != -1)
            {
                fos.write(data);
            }

            long endTime = System.nanoTime();
            System.out.println("Normal Stream Copy Completed in: " + (endTime - startTime)/1_000_000 + " ms");
        }
        catch (IOException e)
        {
            System.out.println("Error: Cannot read/write file.");
        }
        finally
        {
            try
            {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            }
            catch (IOException e)
            {
                System.out.println("Error while closing streams.");
            }
        }
    }

    // Copy file using BufferedInputStream/BufferedOutputStream (chunk size 4 KB)
    void copyFileBuffered(String sourceFile, String destinationFile)
    {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try
        {
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destinationFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;
            long startTime = System.nanoTime();

            while ((bytesRead = bis.read(buffer)) != -1)
            {
                bos.write(buffer, 0, bytesRead);
            }

            long endTime = System.nanoTime();
            System.out.println("Buffered Stream Copy Completed in: " + (endTime - startTime)/1_000_000 + " ms");
        }
        catch (IOException e)
        {
            System.out.println("Error: Cannot read/write file.");
        }
        finally
        {
            try
            {
                if (bis != null) bis.close();
                if (bos != null) bos.close();
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            }
            catch (IOException e)
            {
                System.out.println("Error while closing streams.");
            }
        }
    }
}

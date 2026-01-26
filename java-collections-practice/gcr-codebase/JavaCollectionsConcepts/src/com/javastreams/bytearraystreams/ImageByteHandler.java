package com.javastreams.bytearraystreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

class ImageByteHandler
{
    void convertImageToByteArray(String sourceImage, String destinationImage)
    {
        FileInputStream fis = null;
        ByteArrayOutputStream baos = null;
        FileOutputStream fos = null;

        try
        {
            // Read original image
            fis = new FileInputStream(sourceImage);
            baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024]; // 1 KB buffer
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1)
            {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray(); // convert image to byte array

            // Write byte array back to new image file
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            fos = new FileOutputStream(destinationImage);

            while ((bytesRead = bais.read(buffer)) != -1)
            {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Image converted to byte array and saved successfully.");
        }
        catch (IOException e)
        {
            System.out.println("Error: Unable to process image file.");
        }
        finally
        {
            try
            {
                if (fis != null) fis.close();
                if (baos != null) baos.close();
                if (fos != null) fos.close();
            }
            catch (IOException e)
            {
                System.out.println("Error while closing streams.");
            }
        }
    }
}

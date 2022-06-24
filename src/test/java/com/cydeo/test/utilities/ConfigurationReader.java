package com.cydeo.test.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1. create properties object
        // make this private to be inaccessible from outside
        // make this static, bcs static runs first and before everything else, and will use the object under static method
        private static Properties properties = new Properties();

    //2.
        //use static block its run first
        static {

            try {
                //Create FileInputStream object to open file as a stream in Java memory.
                FileInputStream file = new FileInputStream("configuration.properties");

                //Load properties object with the file we opened using FileInputStream
                properties.load(file);

//                file.close();

            } catch (IOException e) {
                System.out.println("Error occurred while reading configuration file");
                e.printStackTrace();
            }

        }

    //3.
        public static String getProperty(String key){
            return properties.getProperty(key);
        }

}

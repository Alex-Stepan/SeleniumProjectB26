package com.cydeo.test.day13_configuration_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_file() throws IOException {

        //1. Create Properties class' object.
            //we need properties class to use getProperty("key") method
            Properties properties = new Properties();

        //2. Create FileInputStream object to open file as a stream in Java memory.
            //use copy path/reference  -->  Path From Content Root
            FileInputStream file = new FileInputStream("configuration.properties");

        //3. Load "properties" object with the "file" we opened using FileInputStream
            properties.load(file);


        //4. We can use properties.getProperty method to read from the file we loaded.
            //(configuration.properties)
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));

        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));

        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));

        System.out.println("properties.get(\"password\") = " + properties.get("password"));


    }



}

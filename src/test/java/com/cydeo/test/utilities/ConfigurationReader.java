package com.cydeo.test.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1.
    private static Properties properties = new Properties();

    //2.
    static {

            try {
                FileInputStream file = new FileInputStream("configuration.properties");

                properties.load(file);

                file.close();

            } catch (IOException e) {
                System.out.println("Error occurred while reading configuration file");
                e.printStackTrace();
            }

    }

    //
    public static String getProperty(String key){
        return properties.getProperty(key);
    }

}

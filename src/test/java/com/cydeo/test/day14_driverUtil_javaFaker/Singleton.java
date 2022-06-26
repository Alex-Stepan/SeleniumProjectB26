package com.cydeo.test.day14_driverUtil_javaFaker;

public class Singleton {

    //1.
    //Creating a private constructor, we are closing access to the object of this class from outside this class
    private Singleton(){}

    //2.
    //Make WebDriver private, to close access from outside this class
    //Make it static, to use it in static method
    private static String word;

    //3.
    //Create re-usable utility method which will return same driver instance when we call it
    public static String getWord(){

        //4.
        // it will check if driver is null, if it is null -> will set up the browser inside if statement
        if(word == null){

            //5.
            //read browser type from configuration.properties using ConfigurationReader class and getProperty() method
            System.out.println("First time calling. Word object is null. Now we are assigning value");

            //6.
            word = "something";

        } else {
            //7.
            System.out.println("Word is already assigned and has value");
        }

        //8.
        return word;
    }


}

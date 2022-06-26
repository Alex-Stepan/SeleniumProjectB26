package com.cydeo.test.day14_driverUtil_javaFaker;

import org.testng.annotations.Test;

public class Singleton_Practice {

    @Test
    public void singleton_understanding_test(){

        String word1 = Singleton.getWord();
        System.out.println("word1 = " + word1);

        String word2 = Singleton.getWord();
        System.out.println("word2 = " + word2);

        String word3 = Singleton.getWord();
        System.out.println("word3 = " + word3);

            /*
            First time calling. Word object is null. Now we are assigning value
            word1 = something
            Word is already assigned and has value
            word2 = something
            Word is already assigned and has value
            word3 = something

             */

    }



}

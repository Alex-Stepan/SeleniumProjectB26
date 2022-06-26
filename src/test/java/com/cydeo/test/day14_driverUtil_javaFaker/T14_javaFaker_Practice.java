package com.cydeo.test.day14_driverUtil_javaFaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class T14_javaFaker_Practice {


    @Test
    public void java_faker_test(){

        //1. create faker object
        Faker faker = new Faker();

        //2.
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().name() = " + faker.name().name());
        System.out.println();

        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));
        System.out.println("faker.numerify(\"571-###-###\") = " + faker.numerify("571-###-###"));
        System.out.println();

        System.out.println("faker.letterify(\"??????????\") = " + faker.letterify("??????????"));
        System.out.println("faker.letterify(\"Alfa-Betta-??????\") = " + faker.letterify("Alfa-Betta-??????"));
        System.out.println();

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());
        System.out.println("faker.finance().creditCard().replaceAll(\"-\", \"\") = " + faker.finance().creditCard().replaceAll("-", ""));
        System.out.println();

        System.out.println("faker.bothify(\"???###-###???\") = " + faker.bothify("???###-###???"));
        System.out.println();

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());

    }



}

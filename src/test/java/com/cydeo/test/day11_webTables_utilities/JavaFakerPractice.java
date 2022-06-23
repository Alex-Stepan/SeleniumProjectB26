package com.cydeo.test.day11_webTables_utilities;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void fakerTest(){
        Faker faker = new Faker();

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        System.out.println("faker.address().streetAddress() = " + faker.address().streetAddress());
        System.out.println("faker.address().city() = " + faker.address().city());
        System.out.println("faker.address().state() = " + faker.address().state());
        System.out.println("faker.address().zipCode() = " + faker.address().zipCode());

        System.out.println("faker.number().numberBetween(10, 90) = " + faker.number().numberBetween(10, 90));
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));
        System.out.println("faker.letterify(\"??????\") = " + faker.letterify("??????"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());
        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());
        System.out.println("faker.numerify(\"##/##\") = " + faker.numerify("##/##"));
    }
}

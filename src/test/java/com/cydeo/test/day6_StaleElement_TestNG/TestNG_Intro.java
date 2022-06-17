package com.cydeo.test.day6_StaleElement_TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setUp(){
        System.out.println("Before class is running...");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("After class is running...");
    }

        @BeforeMethod
        public void setUpMethod(){
            System.out.println("  Before Method is running...");
        }

        @AfterMethod
        public void tearDownMethod(){
        System.out.println("  After Method is running...");
    }

            @Test (priority = 1)
            public void test1(){
                System.out.println("    Test 1 is running...");
                String actual = "apple";
                String expected = "apple";
                Assert.assertEquals(actual, expected, "Test1 FAIL");
            }

            @Test (priority = 2)
            public void test2(){
                System.out.println("    Test 2 is running..");
                Assert.assertEquals("orange","orange", "Test2 FAIL");
            }


}

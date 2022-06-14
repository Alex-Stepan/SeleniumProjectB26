package com.VyTruck.utilities;

import java.util.ArrayList;

public class VT_LoginCredentials {

    /** 1. ArrayList with Correct usernames */
    public static ArrayList<String> getCorrectUsernameList() {
        //1.1.
        ArrayList<String> UsernameList = new ArrayList<>();

        //1.2. add elements to ArrayList
        UsernameList.add("user42");
        UsernameList.add("user43");
        UsernameList.add("user44");

        UsernameList.add("storemanager79");
        UsernameList.add("storemanager80");
        UsernameList.add("storemanager247");

        UsernameList.add("salesmanager143");
        UsernameList.add("salesmanager144");
        UsernameList.add("salesmanager145");

        //1.3.
        System.out.println("Size of the UsernameList is : " + UsernameList.size() + " elements");
        System.out.println("------------------------------------------------------");
        return UsernameList;
    }


    /** 2. ArrayList with Correct passwords */
    public static ArrayList correctPasswords () {
        //1.
        ArrayList<String> cor_Passwords = new ArrayList<>();
        //2.
        cor_Passwords.add("UserUser123");
        //3.
        ArrayList<String> correctPasswordList = new ArrayList<>(cor_Passwords);
        //4.
        return  correctPasswordList;
    }
}

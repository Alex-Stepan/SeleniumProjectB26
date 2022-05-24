package com.NextBaseCRM.utilities;

import java.util.ArrayList;

public class Login_Credentials {

    public static void main(String[] args) {

        //1.ArrayList for Correct usernames
        ArrayList<String> UsernameList = new ArrayList<>();

        //5. add elements to ArrayList
        UsernameList.add("helpdesk29@cybertekschool.com");
        UsernameList.add("helpdesk30@cybertekschool.com");

        UsernameList.add("marketing29@cybertekschool.com");
        UsernameList.add("marketing30@cybertekschool.com");

        UsernameList.add("hr29@cybertekschool.com");
        UsernameList.add("hr30@cybertekschool.com");


        System.out.println("Size of the UsernameList is : " + UsernameList.size() + " elements");
        System.out.println("------------------------------------------------------");

        //2. ArrayList for Correct passwords
        ArrayList<String> cor_PasswordList = new ArrayList<>();

            cor_PasswordList.add("UserUser");

        ArrayList<String> correctPasswordList = new ArrayList<>(cor_PasswordList);


        //3. ArrayList for Wrong usernames
        ArrayList<String> wrongUsernameList = new ArrayList<>();

            wrongUsernameList.add("wrong29@cybertekschool.com");
            wrongUsernameList.add("wrong30@cybertekschool.com");

        //4. ArrayList for Wrong passwords
        ArrayList<String> wrongPasswordList = new ArrayList<>();

            wrongPasswordList.add("WrongWrong");
            wrongPasswordList.add("WrongUser");

    }

    /** 1. ArrayList with Correct usernames */
    public static ArrayList<String> getCorrectUsernameList() {
        //1.1.
        ArrayList<String> UsernameList = new ArrayList<>();

        //1.2. add elements to ArrayList
        UsernameList.add("helpdesk29@cybertekschool.com");
        UsernameList.add("helpdesk30@cybertekschool.com");

        UsernameList.add("marketing29@cybertekschool.com");
        UsernameList.add("marketing30@cybertekschool.com");

        UsernameList.add("hr29@cybertekschool.com");
        UsernameList.add("hr30@cybertekschool.com");

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
            cor_Passwords.add("UserUser");
        //3.
        ArrayList<String> correctPasswordList = new ArrayList<>(cor_Passwords);
        //4.
        return  correctPasswordList;
    }


}

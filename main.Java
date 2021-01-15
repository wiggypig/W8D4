package com.company;

public class Main {

    public static void main(String[] args) {


        // illegal field names
//        int int = 1; // int is a reserved word
//        double float = 50.0;  // float is a reserved word
//        String null = "we should never do this"; // null is a reserved word


        // uninitialized variables
        int unInitialized;
//        System.out.println(unInitialized);  // not initialized, can be the source of many issues!

        String unInitialized;
        {
            unInitialized = "This could be trouble!";
        }
        System.out.println("Am I? " + unInitialized); // Do not run this!

    }
}

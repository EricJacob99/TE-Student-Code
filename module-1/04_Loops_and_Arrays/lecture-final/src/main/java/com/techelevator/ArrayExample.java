package com.techelevator;

public class ArrayExample {

    public static void main(String[] args) {


        int numberOfStudents = 5;

        // CREATE AND INSTANTIATE AN ARRAY
        String[] names = new String[numberOfStudents];
        int[] nums = new int[10];
        boolean[] whatIfs = new boolean[7];

        //BE ABLE TO PUT THINGS INTO AN ARRAY
        names[2] = "Kari";
        names[1] = "Josh";

        System.out.println("The name at index 2 is: " + names[2]);

        System.out.println("The size of the nums array is: " + nums.length);

        //STATIC INITIALIZATION OF AN ARRAY
        double[] decimalNumbers = new double[] {0.1, 0.1, 0.1, 0.1, 0.1};

//index out of bounds exception below

//        for (int i = 0; i < names.length; i++) {
//            System.out.println("Name is: " + names[i+5]);
//        }






    }


}

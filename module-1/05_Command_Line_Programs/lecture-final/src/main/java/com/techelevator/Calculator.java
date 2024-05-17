package com.techelevator;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        //create a new scanner
        Scanner numberScanner = new Scanner(System.in);

        //prompt the user to enter numbers
        System.out.println("Please enter all the numbers you want added together, separate by commas");

        //wait for the user to enter everything and we will store the answer in the numbers variable
        String numbers = numberScanner.nextLine();

        // we need to split the above string into its parts and the split method will parse by comma and returns an array of
        // string numbers
        String[] myNums = numbers.split(",");


        // we need a variable to hold the sum
        int sum = 0;

        //we need to loop through the array and add up all the numbers
           // start the loop
               // convert each element of the array (string --> int) and add to sum

        for (int i=0; i < myNums.length; i++) {

            // take the string value from myNums[i] and convert to an int
            int value = Integer.parseInt(myNums[i]);
            sum = sum + value;

            //take the int value and add it to sum

        }


        //print the sum
        System.out.println(sum);






    }




}

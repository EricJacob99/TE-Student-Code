package com.techelevator;

import java.util.Scanner;

public class DogYears {

    public static void main(String[] args) {


    Scanner ageScanner = new Scanner(System.in);
        System.out.println("Please enter your age, you silly human:");
        String ageOfHumanAsAString = ageScanner.nextLine();



        int ageOfHumanAsAnInteger = Integer.parseInt(ageOfHumanAsAString);

        int ageinDogYears = ageOfHumanAsAnInteger * 7;

        System.out.println("A human who is " + ageOfHumanAsAString + " is " + ageinDogYears + " old in dog years.");


//OPTION 2 - use nextInt() --> Don't forget to deal with leftover newline character (eg follow up with readline())
//        System.out.println("Please enter your age, you silly human:");
//        int humanAge = ageScanner.nextInt();
//        ageScanner.nextLine();
//
//
//        System.out.println("Please enter your favorite color: ");
//        String color = ageScanner.nextLine();
//
//        System.out.println("Your age is: " + humanAge + " and your favorite color is" + color);


    }

}

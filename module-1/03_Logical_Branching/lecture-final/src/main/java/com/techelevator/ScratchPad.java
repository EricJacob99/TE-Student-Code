package com.techelevator;

public class ScratchPad {


    public static void main(String[] args) {

        System.out.println("I am the main method");
        ScratchPad scratchPad = new ScratchPad();
        int result = scratchPad.addNumbers(5,7);
        System.out.println(result);


        boolean isSafe = scratchPad.areWeSafeFromDogsAndBees(true, false);
        if(isSafe) {
            System.out.println("We are safe!");
        }
        else {
            System.out.println("We are not safe!!!! Run!");
        }






    }



    



    public int addNumbers(int num1, int num2) {
        //take num1 and num2 and add them together
        int sum = num1 + num2;

        //return the sum
        return sum;


    }

    public boolean areWeSafeFromDogsAndBees(boolean areDogsPresent, boolean areBeesPresent) {

        //check to see if areDogsPresent OR areBeesPresent and if so, return false
        if (areDogsPresent || areBeesPresent) {
            return false;
        }
        return true;

    }



}

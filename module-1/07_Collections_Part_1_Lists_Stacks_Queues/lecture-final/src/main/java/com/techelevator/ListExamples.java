package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {

        //BE ABLE TO DECLARE AND INSTANTIATE ARRAYLIST
        List<Integer> testScores = new ArrayList<>();
        List<String> ninjaNames = new ArrayList<>();
        List<Boolean> truthyStuff = new ArrayList<>();

        //BE ABLE TO PUT THINGS INTO OUR LIST
        testScores.add(5);
        testScores.add(10);
        testScores.add(15);

        ninjaNames.add("Cole");
        ninjaNames.add("Ryan");
        ninjaNames.add("Madeline");
        ninjaNames.add("Andy");

        System.out.println(ninjaNames.get(1));
        ninjaNames.add(1, "Andy");
        System.out.println(ninjaNames.get(1));

        truthyStuff.add(false);
        truthyStuff.add(true);


        //BE ABLE TO GET THINGS OUT

        int scoreAtIndex1 = testScores.get(1);
        System.out.println(scoreAtIndex1);


        //BE ABLE TO REMOVE ITEMS FROM A LIST
        ninjaNames.remove(0);

        System.out.println(ninjaNames);

        //BE ABLE TO SEE IF AN ITEM IS FOUND IN AN ARRAYLIST (contains)
        // lets add Cole back but only if he is not already in the list
        boolean isColeInMyList = ninjaNames.contains("Cole");
        if (!isColeInMyList) {
            ninjaNames.add("Cole");
        }

        //BE ABLE TO LOOP USING A REGULAR FOR LOOP

        for (int i = 0; i< ninjaNames.size(); i++ ) {
            if (ninjaNames.get(i).equals("Ryan")) {
                System.out.println("We removed: " + ninjaNames.get(i));
                ninjaNames.remove(i);
                break;
            }

        }



        //BE ABLE TO LOOP USING AN ENHANCED FOR LOOP (FOR EACH)
        for (String ninja : ninjaNames) {

            if (ninja.equals("Cole")) {
                System.out.println("We found Cole");
            }

        }



        //BE ABLE TO TAKE AN ARRAY AN TURN INTO A LIST
        double[] measurements = new double[] { 2.0, 3.0, 4.4, 5.5};   //static initialization (aka we know/set the values at creation time)

        List<Double> mList = new ArrayList<>();

        for (double measurement : measurements) {
            mList.add(measurement);
        }

        for (int i = 0; i< measurements.length; i++) {
            mList.add(measurements[i]);
        }





        //BE ABLE TO TAKE A LIST AND CONVERT INTO AN ARRAY
        List<Float> floaties = new ArrayList<>();
        floaties.add(1.0f);
        floaties.add(2.2f);

        float[] floatArray = new float[floaties.size()];
        for (int i=0; i< floaties.size(); i++) {

            floatArray[i] = floaties.get(i);

        }





    }

}

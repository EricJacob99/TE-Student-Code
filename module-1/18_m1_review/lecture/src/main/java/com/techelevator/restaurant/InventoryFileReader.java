package com.techelevator.restaurant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventoryFileReader {

    public List<Ingredient> loadFile(String fileName) throws FileNotFoundException {

        File inventoryFile = new File(fileName);

        // Create an empty list so I can add ingredients from the file to it
        List<Ingredient> listOfIngredients = new ArrayList<>();

        //read from the file
        try (Scanner scanner = new Scanner(inventoryFile)) {

            // loop until end of file
            while(scanner.hasNextLine()) {

                Ingredient ingredient = new Ingredient();

                // for each record in the file, take that data and stick it into the Ingredient object
                String record = scanner.nextLine();
                String[] fields = record.split(",");

                ingredient.setIngredientName(fields[0]);
                ingredient.setQuantity(Integer.parseInt(fields[1]));


                //add that ingredient object to the list
                listOfIngredients.add(ingredient);

            }


        }


        return listOfIngredients;
    }










}

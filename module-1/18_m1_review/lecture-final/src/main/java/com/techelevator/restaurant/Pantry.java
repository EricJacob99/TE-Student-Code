package com.techelevator.restaurant;

import java.io.FileNotFoundException;
import java.util.List;

public class Pantry {

    private InventoryFileReader fileReader;
    private List<Ingredient> ingredients;

    public Pantry(String fileName) throws FileNotFoundException {
        fileReader = new InventoryFileReader();
        ingredients = fileReader.loadFile(fileName);

    }





}

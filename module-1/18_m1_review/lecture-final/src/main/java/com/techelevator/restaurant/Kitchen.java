package com.techelevator.restaurant;

import java.io.FileNotFoundException;
import java.util.List;

public class Kitchen {

    private Pantry pantry;

    public Kitchen(String fileName) throws FileNotFoundException {
        pantry = new Pantry(fileName);
    }


    public boolean cook(Order order) throws IngredientOutOfStockException{

          List<Burger> burgers = order.getBurgers();
          boolean hasIngredients = true;      //TODO - change this to be a lookup tomorrow.

          if (burgers != null) {

              for (Burger burger : burgers) {

                  // check ingredients
                  List<Ingredient> requestIngredients = burger.getToppings();
                  //pretend we are out of stock
                  if(!hasIngredients) {
                      throw new IngredientOutOfStockException();
                  }


                  //TODO: prepare burger and cook

              }



              return true;
          }

          return false;


    }


}

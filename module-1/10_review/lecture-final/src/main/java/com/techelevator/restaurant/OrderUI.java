package com.techelevator.restaurant;

import java.util.Scanner;

public class OrderUI {

    private Scanner myScanner = new Scanner(System.in);



    public Order takeOrder() {

        Order newOrder = new Order();

        //Create a burger
        Burger burger = new Burger();


        //ask for 3 ingredients and bun type
        System.out.println("What type of bun would you like?");
        String bunType = myScanner.nextLine();
        burger.setBunType(bunType);

        System.out.println("How would you like the burger cooked?");
        String howCooked = myScanner.nextLine();
        burger.setHowCooked(howCooked);

        System.out.println("Please enter your desired ingredients (separated by commas)");
        String ingredientsAsString = myScanner.nextLine();
        String[] ingredients = ingredientsAsString.split(",");

        //loop through the string[] and take each item and create an Ingredient object
        for (String ingredient : ingredients) {
            Ingredient newIngredient = new Ingredient();
            newIngredient.setIngredientName(ingredient);
            burger.addIngredient(newIngredient);
        }







        //add the burger to the order
        newOrder.addBurgerToOrder(burger);

        return newOrder;

    }

}

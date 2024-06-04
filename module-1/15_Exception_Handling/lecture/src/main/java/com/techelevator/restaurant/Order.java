package com.techelevator.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Order {


    private List<Burger> burgers = new ArrayList<>();


    public void addBurgerToOrder(Burger newBurgerToAdd) {
        burgers.add(newBurgerToAdd);
    }

    public void printOrder() {
        int row = 1;
        for( Burger b: burgers) {
            System.out.println( row + ". " + b.getBunType() + " " + b.getHowCooked());
            System.out.println("Ingredients:");
            for (Ingredient i : b.getToppings()) {
                System.out.println(i.getIngredientName());
            }
            row++;
        }
    }


}

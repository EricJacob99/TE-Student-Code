package com.techelevator.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Order {


    private List<Burger> burgers = new ArrayList<>();


    public void addBurgerToOrder(Burger newBurgerToAdd) {
        burgers.add(newBurgerToAdd);
    }


    public List<Burger> getBurgers() {
        return burgers;
    }
}

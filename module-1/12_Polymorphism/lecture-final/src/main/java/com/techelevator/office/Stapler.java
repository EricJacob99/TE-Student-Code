package com.techelevator.office;

public class Stapler extends Product {

    public Stapler(String brand, String color, double price, int initialQuantity, String itemName) {
        super(brand, color, price, initialQuantity, itemName);
    }

    public void stapleSomething() {
        System.out.println("I just stapled something!");
    }


}

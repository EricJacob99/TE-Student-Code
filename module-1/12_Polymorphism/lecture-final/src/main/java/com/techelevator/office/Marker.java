package com.techelevator.office;

public class Marker extends Product  {

    public Marker(String brand, String color, double price, int initialQuantity, String itemName) {
        super(brand, color, price, initialQuantity, itemName);
    }

    public void writeSomething(String text) {
        System.out.println(text);
    }

}

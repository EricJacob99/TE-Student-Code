package com.techelevator.office;

public class Product implements Sellable{


    private String brand;
    private String color;

    private double price;

    private int quantityOnHand;

    private String itemName;


    public Product (String brand, String color, double price, int initialQuantity, String itemName) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.quantityOnHand = initialQuantity;
        this.itemName = itemName;
    }


    public String getBrand() {
        return brand;
    }


    public String getColor() {
        return color;
    }


    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getInventoryCount() {
        return quantityOnHand;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int addToInventory(int quantityToAdd) {
        return quantityOnHand = quantityOnHand + quantityToAdd;
    }

    @Override
    public int removeFromInventory(int quantityToRemove) {
        return quantityOnHand = quantityOnHand - quantityToRemove;
    }

    @Override
    public String getItemName() {
        return itemName;
    }




}

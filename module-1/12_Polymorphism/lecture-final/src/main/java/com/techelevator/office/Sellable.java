package com.techelevator.office;

public interface Sellable {

    double getPrice();
    int getInventoryCount();

    void setPrice(double price);

    int addToInventory(int quantityToAdd);

    int removeFromInventory(int quantityToRemove);

    String getItemName();



}

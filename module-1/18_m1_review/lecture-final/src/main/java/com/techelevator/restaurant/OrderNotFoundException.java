package com.techelevator.restaurant;

public class OrderNotFoundException extends Exception{

    private int orderNumber;

    public OrderNotFoundException(int orderNumber) {

    }


}

package com.techelevator.restaurant;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        //create an instance of the ui
        OrderUI ui = new OrderUI();

        // call the ui to get us a order
        Order newOrder = ui.takeOrder();


        //print the order
        newOrder.printOrder();


    }

}

package com.techelevator.restaurant;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        OrderUI ui = new OrderUI();

        Order newOrder = ui.takeOrder();

        newOrder.printOrder();;


    }

}

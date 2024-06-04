package com.techelevator.restaurant;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        App app = new App();
        app.run();

    }


    public void run() {


        OrderUI ui = new OrderUI();
        Kitchen kitchen = new Kitchen();


        while (true) {

            String userChoice = ui.showMainMenu();
            if (userChoice.equals("1")) {
                //take the order
                Order newOrder = ui.takeOrder();
                // send to the kitchen
                boolean isReady = false;
                try {
                    isReady = kitchen.cook(newOrder);

                    if(isReady) {
                        ui.printMessage("Your order was cooked and ready");
                    }
                    else {
                        ui.printMessage("An unknown error occurred. Please ask your server");
                    }


                } catch (IngredientOutOfStockException e) {
                    ui.printMessage("We are out of stock on some or all of your ingredients. Please ask your server");
                }


            }
            else if (userChoice.equals("2")) {
                //print the order
                ui.printMessage("Not implemented yet!");
            }
            else if (userChoice.equals("3")) {
                //exit
                break;
            }
            else {
                //error invalid input
                ui.printMessage("Invalid input. Please try again.");
            }

        }

        System.out.println("Thank you!  Goodbye!");



    }


//    //create an instance of the ui
//    OrderUI ui = new OrderUI();
//
//    // call the ui to get us a order
//    Order newOrder = ui.takeOrder();
//
//
//    //print the order
//        newOrder.printOrder();

}

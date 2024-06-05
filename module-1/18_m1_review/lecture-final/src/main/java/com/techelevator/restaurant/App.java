package com.techelevator.restaurant;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        App app = new App();
        app.run();

    }


    public void run() {


        OrderUI ui = new OrderUI();
        LogWriter writer = new LogWriter();
        OrderService service = null;

        try {
            String fileName = ui.askUserForInventoryFileName();
            service = new OrderService(fileName);
        } catch (FileNotFoundException e) {
             ui.printMessage("We can't open for business because we have not loaded our inventory. File not found. Please call support!");
             System.exit(1);
        }


        while (true) {

            String userChoice = ui.showMainMenu();
            if (userChoice.equals("1")) {
                //take the order
                Order newOrder = ui.takeOrder();

                //send the order to the Order Service
                service.addOrder(newOrder);

                writer.writeToLog("Order id: " + newOrder.getOrderId() + " has been sent to the order manager(kitchen)");



            }
            else if (userChoice.equals("2")) {
                //fetch the order from order manager
                int orderId = ui.askUserForOrderId();


                //look up order in order service
                try {
                    Order foundOrder = service.retrieveOrderById(orderId);

                    //send to ui to print
                    ui.printOrderReceipt(foundOrder);

                } catch (OrderNotFoundException e) {
                    ui.printMessage("Order " + orderId + " not found!");
                }


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

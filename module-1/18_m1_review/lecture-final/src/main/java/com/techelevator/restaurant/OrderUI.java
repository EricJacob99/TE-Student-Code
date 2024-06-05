package com.techelevator.restaurant;

import java.util.Scanner;

public class OrderUI {

    private Scanner myScanner = new Scanner(System.in);

    public String askUserForInventoryFileName() {
        System.out.println("Please enter inventory file name:");
        return  myScanner.nextLine();
    }

    public int askUserForOrderId() {
        System.out.println("What is the order id you want? ");
        return Integer.parseInt(myScanner.nextLine());
    }


    public String showMainMenu() {

        //print main menu and return the user's choice:

        System.out.println("********* JG BURGERS MAIN MENU");
        System.out.println("1.  Add Order");
        System.out.println("2.  Print Receipt (By Order Id)");
        System.out.println("3.  Exit");

        return myScanner.nextLine();


    }

    public void printMessage (String message) {
        System.out.println(message);
    }



    public Order takeOrder() {

        Order newOrder = new Order();

        //Create a burger
        Burger burger = new Burger();


        //ask for 3 ingredients and bun type
        System.out.println("What type of bun would you like?");
        String bunType = myScanner.nextLine();
        burger.setBunType(bunType);

        System.out.println("How would you like the burger cooked?");
        String howCooked = myScanner.nextLine();
        burger.setHowCooked(howCooked);

        System.out.println("Please enter your desired ingredients (separated by commas)");
        String ingredientsAsString = myScanner.nextLine();
        String[] ingredients = ingredientsAsString.split(",");

        //loop through the string[] and take each item and create an Ingredient object
        for (String ingredient : ingredients) {
            Ingredient newIngredient = new Ingredient();
            newIngredient.setIngredientName(ingredient);
            burger.addIngredient(newIngredient);
        }


        //add the burger to the order
        newOrder.addBurgerToOrder(burger);


        //TODO - server to add total order cost because we don't have a way yet to do that automagically)
        System.out.println("Server, what is the total order cost?");
        newOrder.setTotalOrderCost(Double.parseDouble(myScanner.nextLine()));

        System.out.println("Server, what is the order number for this?");
        newOrder.setOrderId(Integer.parseInt(myScanner.nextLine()));


        return newOrder;

    }

    public void printOrderReceipt (Order order) {
        System.out.println("Order id: " + order.getOrderId() +  " Total Cost: " + order.getTotalOrderCost()) ;
    }



}

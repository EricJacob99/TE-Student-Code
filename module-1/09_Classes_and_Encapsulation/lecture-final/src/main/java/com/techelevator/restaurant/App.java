package com.techelevator.restaurant;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Burger> order = new ArrayList<>();

        Burger myBurger = new Burger("grass fed bison");   //instantiated an instance of a Burger in memmory
        myBurger.setBunType("Gluten Free");    //calling the setters
        myBurger.setHowCooked("Well done");
        order.add(myBurger);

        Burger yourBurger = new Burger("beef");
        yourBurger.setHowCooked("still mooing");
        yourBurger.setBunType("wheat");
        order.add(yourBurger);

        Burger extraBurger = new Burger();




        //print the order
        for (Burger b : order) {
            System.out.println(b.getBunType() + " " + b.getHowCooked());
        }



        //call calculator for no real reason other than to show you method overloading
        Calculator calc = new Calculator();
        int result = calc.add2(2,3);

        System.out.println(calc.add3(4,4,4));
        result = calc.add3(2,2,2);
    }

}

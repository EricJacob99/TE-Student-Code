package com.techelevator.office;

import java.util.ArrayList;
import java.util.List;

public class App {


    public static void main(String[] args) {

        Marker marker = new Marker("Expo", "black", 0.50, 20, "Expo Marker - Dry Erase");
        Stapler redStapler = new Stapler("Swingline", "red", 2.00, 5, "supercool - who stole my red stapler");
        Stapler normalStapler = new Stapler("PaperMate", "black", 1.00, 50, "Not a cool stapler, because the red one is nicer");
        CashRegister cashRegister = new CashRegister();

        // This is polymorphism
        List<Sellable> items = new ArrayList<>();
        items.add(marker);
        items.add(redStapler);
        items.add(normalStapler);

        for (Sellable item : items) {

            System.out.println(item.getItemName() + " " + item.getPrice());

            // THIS IS USUALLY BAD
             if(item instanceof Stapler) {
                 Stapler temp = (Stapler)item;
                 temp.stapleSomething();
             }

        }

        marker.writeSomething("We just printed our our list of Sellable items");


        



    }





}

package com.techelevator.restaurant;

public class Burger {

    //CLASS VARIABLES GO HERE
    private String bunType;
    private String howCooked;    //well done, rare,
    private String meatType;      //TODO - Come back later and add a List<Ingredients>


    //CONSTRUCTOR
    public Burger (String meatType) {
        this.meatType = meatType;
    }

    //default constructor - have to put back in because I want one, and if I don't do this, Java won't let me use a default constructor because of the custom one above
    public Burger () {
       this.meatType = "beef";
    }

    //GETTERS and SETTERS

    public String getBunType() {
        return bunType;
    }

    public void setBunType(String bunType) {
        this.bunType = bunType;
    }

    public String getHowCooked() {
        return howCooked;
    }

    public void setHowCooked(String howCooked) {
        this.howCooked = howCooked;
    }

}

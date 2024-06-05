package com.techelevator;

public class MovieRental {
    private String title;
    private String format;
    private Boolean isPremium;
    private Double rentalPrice;
    private int daysLate;

    public String getTitle() {
        return title;
    }

    public String getFormat() {
        return format;
    }

    public boolean getPremium() {
        return isPremium;
    }

    public double getRentalPrice() {
        double price = 0;

        if (format == "VHS"){
            price = price + 0.99;
        }
        if (format == "DVD"){
            price = price + 1.99;
        }
        if (format == "BluRay"){
            price = price + 2.99;
        }
        if (isPremium && price > 0) {
            price = price + 1.00;
        }

        return price;
    }

    public int getDaysLate() {
        return daysLate;
    }

    public MovieRental(String title, String format, Boolean isPremium) {
        this.title = title;
        this.format = format;
        this.isPremium = isPremium;
    }

    public double lateFee(int daysLate) {
        if (daysLate >= 3){
            return 19.99;
        } else if (daysLate == 2){
            return 3.99;
        } else if (daysLate == 1){
            return 1.99;
        } else {
            return 0.00;
        }
    }

    @Override
    public String toString() {
        return "MOVIE: " + getTitle() + " - FORMAT: " + getFormat() + " PRICE: " + getRentalPrice();
    }

}

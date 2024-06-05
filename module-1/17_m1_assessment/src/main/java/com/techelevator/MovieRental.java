package com.techelevator;

public class MovieRental {
    private String title;
    private String format;
    private Boolean isPremium;
    private Double rentalPrice;

    public String getTitle() {
        return title;
    }

    public String getFormat() {
        return format;
    }

    public Boolean getPremium() {
        return isPremium;
    }

    public Double getRentalPrice() {
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

    public MovieRental(String title, String format, Boolean isPremium) {
        this.title = title;
        this.format = format;
        this.isPremium = isPremium;
    }

    @Override
    public String toString() {
        return "MOVIE: " + title + " - FORMAT: " + format + " PRICE: " + rentalPrice;
    }

}

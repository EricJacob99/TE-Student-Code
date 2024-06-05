package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MovieRentalTest {

    private MovieRental movieRental;

    @Before
    public void setup() {

        MovieRental movieRental = new MovieRental("","",null);

    }

    @Test
    public void testMovieRentalRentalPrice() {
        MovieRental dieHardRental = new  MovieRental("Die Hard", "BluRay", true);
        MovieRental jurassicParkRental = new  MovieRental("Jurassic Park", "DVD", false);
        MovieRental bambiRental = new  MovieRental("Bambi", "VHS", false);

        Assert.assertEquals(3.99,dieHardRental.getRentalPrice());
        Assert.assertEquals(1.99,jurassicParkRental.getRentalPrice());

    }

    @Test
    public void testMovieRentalLateFee() {
        MovieRental movieRental = new MovieRental("","",null);

        Assert.assertEquals(19.99, movieRental.lateFee(4));
        Assert.assertEquals(19.99, movieRental.lateFee(3));
        Assert.assertEquals(3.99, movieRental.lateFee(2));
        Assert.assertEquals(1.99, movieRental.lateFee(1));
        Assert.assertEquals(0.00, movieRental.lateFee(0));
        Assert.assertEquals(0.00, movieRental.lateFee(-3));

    }

    @After
    public void teardown() {
    }
}

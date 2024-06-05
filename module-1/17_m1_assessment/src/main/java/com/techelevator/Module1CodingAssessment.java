package com.techelevator;

import java.util.*;

public class Module1CodingAssessment {

	public static void main(String[] args) {
		Module1CodingAssessment mca = new Module1CodingAssessment();
		mca.run();
	}

	private void run() {
           //start coding here... You will call other class or classes from here as needed, or write additional methods.

		MovieRental dieHardRental = new  MovieRental("Die Hard", "BluRay", true);
		MovieRental jurassicParkRental = new  MovieRental("Jurassic Park", "DVD", false);
		MovieRental bambiRental = new  MovieRental("Bambi", "VHS", false);

		List<MovieRental> rentals= new ArrayList<>();

		rentals.add(dieHardRental);
		rentals.add(jurassicParkRental);
		rentals.add(bambiRental);

//		for (MovieRental rental : rentals) {
//			System.out.println(rental.toString());
//		}
	}

}

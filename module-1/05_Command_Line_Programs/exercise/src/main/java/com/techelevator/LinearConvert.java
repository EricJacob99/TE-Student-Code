package com.techelevator;
import java.util.Scanner;
public class LinearConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the length: ");
		Integer initialMeasurement = input.nextInt();
		Scanner input2 = new Scanner(System.in);
		System.out.print("Is the measurement in (m)eters, or (f)eet? ");
		String distanceUnit = input2.nextLine();
		if (distanceUnit.equals("f")) {
			String finalDistance = ((int)(initialMeasurement * 0.3048) + "m");
			System.out.print(initialMeasurement + distanceUnit + " is " + finalDistance);
		} else if (distanceUnit.equals("m")) {
			String finalDistance = ((int)(initialMeasurement * 3.2808399) + "f");
			System.out.print(initialMeasurement + distanceUnit + " is " + finalDistance);
		}

	}

}

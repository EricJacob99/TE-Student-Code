package com.techelevator;
import java.util.Scanner;
public class TempConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the temperature: ");
		Integer initialTemperature = input.nextInt();
		Scanner input2 = new Scanner(System.in);
		System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit? ");
		String temperatureMeasurementUnit = input2.nextLine();
		if (temperatureMeasurementUnit.equals("C")) {
			String finalTemp = ((int)(initialTemperature * 1.8 + 32) + "F");
			System.out.print(initialTemperature + temperatureMeasurementUnit + " is " + finalTemp);
		} else if (temperatureMeasurementUnit.equals("F")) {
			String finalTemp = ((int)((initialTemperature - 32) / 1.8) + "C");
			System.out.print(initialTemperature + temperatureMeasurementUnit + " is " + finalTemp);
		}

	}

}

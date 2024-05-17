package com.techelevator;
import java.util.Arrays;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String userInput = input.nextLine();
		String[] num = userInput.split(" ");
		for (int i = 0; i < num.length; i++) {
			int number = Integer.parseInt(num[i]);
			int originalNumber = number;
			int numCheck = number;
			int arraySize = 1;
			while (numCheck / 2 != 0) {
				numCheck = numCheck / 2;
				arraySize++;
			}
			int[] binary = new int[arraySize];
			int a = binary.length - 1;
			while (number != 0) {
				int binaryBuffer = (number % 2);
				binary[a] = binaryBuffer;
				number = number / 2;
				a--;
			}
			System.out.print(originalNumber + " in binary is ");
			for (int j = 0; j < arraySize; j++) {
				System.out.print(binary[j]);
			}
			System.out.println();
		}

	}

}
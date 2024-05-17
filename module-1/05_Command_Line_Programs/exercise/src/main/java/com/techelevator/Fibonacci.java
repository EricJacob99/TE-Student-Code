package com.techelevator;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		Integer fibonacciLimit = input.nextInt();
		int fib1 = 0;
		int fib2 = 1;
		System.out.print(fib1 + ", " + fib2);
		while (fib2 <= fibonacciLimit) {
			int nfib = fib1 + fib2;
			if (nfib <= fibonacciLimit) {
				System.out.print(", " + nfib);
			}
			fib1 = fib2;
			fib2 = nfib;
		}

	}

}

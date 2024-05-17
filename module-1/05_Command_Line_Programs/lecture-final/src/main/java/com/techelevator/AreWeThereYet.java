package com.techelevator;

//import java.util.Scanner;

import java.util.Scanner;

public class AreWeThereYet {


    public static void main(String[] args) {

        Scanner keyBoardScanner = new Scanner(System.in);


        while (true) {


            System.out.println("Are We There Yet (Y)es or (N)o");
            String response = keyBoardScanner.nextLine();

            if (response.equalsIgnoreCase("Yes") || response.equalsIgnoreCase("Y")) {
                System.out.println("Cowabunga!");
                break;
            }
            else if (response.equalsIgnoreCase("No") || response.equalsIgnoreCase("N")) {
                System.out.println("Eat My Shorts!");
            }
            else {
                System.out.println("Error: You would be better off watching Family Guy!");
            }


        }

        System.out.println("Good Bye!");



    }

}

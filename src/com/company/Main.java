package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Answer these questions");
        String myAnswer = keyboard.next();
        System.out.println("What is your first initial?");
        String firstInitial = keyboard.next();
        System.out.println("What is your last name?");
        String lastName = keyboard.next();
        System.out.println("What is your house number?");
        String houseNumber = keyboard.next();
        System.out.println("What is your street name?");
        String streetName = keyboard.next();
        System.out.println("What is your street type?");
        String streetType = keyboard.next();
        System.out.println("What is your city?");
        String city = keyboard.next();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city + " ");
    }
}

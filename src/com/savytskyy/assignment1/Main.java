package com.savytskyy.assignment1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Celcius Farenheit conversion
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the temperature in Celcius: ");
        double tempC = scan.nextDouble();
        double tempF = tempC*9/5+32;
        System.out.println("This temperature value in Farenheit is: "+tempF);



    }
}

package com.savytskyy.assignment1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Celcius Farenheit conversion
        Scanner scan = new Scanner(System.in);
        System.out.println("This is assignment 1 of Elementary Java course");
        System.out.print("Please enter the temperature in Celcius: ");
        double tempC = scan.nextDouble();
        double tempF = tempC*9/5+32;
        System.out.println("This temperature value in Farenheit is: "+tempF);
        System.out.println("");

    //Extra credit assignment
        System.out.println("This is assignment 1+ of Elementary Java course");
        System.out.print("Please enter a 4-digit number ABCD:");
        int num = scan.nextInt();
        int A = num/1000;
        num = num-A*1000;
        int B = num/100;
        num = num - B*100;
        int C = num/10;
        int D = num - C*10;
        int sum = A+B+C+D;
        System.out.println("The total sum of all digits (A+B+C+D) will be:" + sum);




    }
}

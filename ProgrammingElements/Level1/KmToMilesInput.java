package ProgrammingElements.Level1;

import java.util.Scanner;

public class KmToMilesInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble(); 

        double miles = kilometers * 0.621371;

        System.out.println(kilometers + " km = " + miles + " miles");

        scanner.close(); 
    }
}

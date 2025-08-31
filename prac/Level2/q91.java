package prac.Level2;

import java.util.Scanner;

public class q91 {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] members = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight of member " + (i + 1) + " (kg): ");
            members[i][0] = sc.nextDouble();
            System.out.print("Enter height of member " + (i + 1) + " (cm): ");
            members[i][1] = sc.nextDouble();

            members[i][2] = calculateBMI(members[i][0], members[i][1]);
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Member " + (i + 1) + " -> Weight: " + members[i][0] +
                    " kg, Height: " + members[i][1] + " cm, BMI: " +
                    String.format("%.2f", members[i][2]) +
                    ", Status: " + getBMIStatus(members[i][2]));
        }

        sc.close();
    }
}

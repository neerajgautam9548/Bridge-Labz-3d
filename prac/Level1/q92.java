package prac.Level1;

import java.util.Scanner;

public class q92 {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] trig = calculateTrigonometricFunctions(angle);
        System.out.println("Sine = " + trig[0] + ", Cosine = " + trig[1] + ", Tangent = " + trig[2]);
    }
}

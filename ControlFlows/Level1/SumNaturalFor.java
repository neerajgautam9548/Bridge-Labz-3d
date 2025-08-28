package ControlFlows.Level1;

import java.util.Scanner;

public class SumNaturalFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n >= 0) {
            int formulaSum = n * (n + 1) / 2;
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Sum using formula = " + formulaSum);
            System.out.println("Sum using for = " + sum);
        } else {
            System.out.println("Not a natural number");
        }
    }
}

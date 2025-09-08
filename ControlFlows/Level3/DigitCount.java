package ControlFlows.Level3;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int num = sc.nextInt();
        int count = 0;

        int temp = Math.abs(num);
        if (temp == 0) count = 1;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }
}

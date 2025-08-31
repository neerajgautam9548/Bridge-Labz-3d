package prac.Level1;

import java.util.Scanner;

public class q8 {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        int[] qr = findRemainderAndQuotient(number, divisor);
        System.out.println("Remainder = " + qr[0] + ", Quotient = " + qr[1]);
    }
}

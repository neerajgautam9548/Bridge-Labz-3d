package prac.Level2;

import java.util.Scanner;

public class q9 {
    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is Positive and ");
                if (isEven(numbers[i]))
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        if (result == 0)
            System.out.println("First and Last numbers are Equal");
        else if (result > 0)
            System.out.println("First number is Greater than Last");
        else
            System.out.println("First number is Smaller than Last");

        sc.close();
    }
}

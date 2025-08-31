package prac.Level2;

import java.util.Scanner;

public class q7 {
    public boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        q7 checker = new q7();

        int[] ages = new int[10];
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            if (checker.canStudentVote(ages[i]))
                System.out.println("Student " + (i + 1) + " CAN vote.");
            else
                System.out.println("Student " + (i + 1) + " CANNOT vote.");
        }
        sc.close();
    }
}

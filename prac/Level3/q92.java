package prac.Level3;

import java.util.Random;

public class q92 {
    public static void main(String[] args) {
        int[][] data = generateSalaryAndService(10);
        double[][] results = calculateBonus(data);
        displayResults(data, results);
    }

    // Generate Salary (5-digit) and Service Years
    public static int[][] generateSalaryAndService(int n) {
        Random rand = new Random();
        int[][] arr = new int[n][2]; // [salary, yearsOfService]

        for (int i = 0; i < n; i++) {
            arr[i][0] = 10000 + rand.nextInt(90000); // 5-digit salary
            arr[i][1] = 1 + rand.nextInt(15); // years of service 1–15
        }
        return arr;
    }

    // Calculate Bonus and New Salary
    public static double[][] calculateBonus(int[][] data) {
        double[][] arr = new double[data.length][2]; // [newSalary, bonus]
        for (int i = 0; i < data.length; i++) {
            double bonusRate = (data[i][1] > 5) ? 0.05 : 0.02;
            double bonus = data[i][0] * bonusRate;
            arr[i][1] = bonus;
            arr[i][0] = data[i][0] + bonus;
        }
        return arr;
    }

    // Display Results in Tabular Format
    public static void displayResults(int[][] oldData, double[][] newData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");
        for (int i = 0; i < oldData.length; i++) {
            totalOld += oldData[i][0];
            totalBonus += newData[i][1];
            totalNew += newData[i][0];
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%.2f\n",
                    (i + 1), oldData[i][0], oldData[i][1], newData[i][1], newData[i][0]);
        }

        System.out.println("-------------------------------------------------");
        System.out.printf("TOTAL\t%.2f\t\t \t%.2f\t\t%.2f\n", totalOld, totalBonus, totalNew);
    }
}

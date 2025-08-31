package prac.Level3;

import java.util.Random;

public class q94 {
    public static void main(String[] args) {
        int students = 5; // change as needed
        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }

    // Generate random PCM scores
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = 10 + rand.nextInt(90); // Physics
            arr[i][1] = 10 + rand.nextInt(90); // Chemistry
            arr[i][2] = 10 + rand.nextInt(90); // Math
        }
        return arr;
    }

    // Calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] arr = new double[scores.length][3]; // [total, avg, %]
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            arr[i][0] = total;
            arr[i][1] = Math.round(avg * 100.0) / 100.0;
            arr[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return arr;
    }

    // Display table
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\n");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
    }
}

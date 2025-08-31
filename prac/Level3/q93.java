package prac.Level3;

public class q93 {
    public static void main(String[] args) {
        int x1 = 2, y1 = 4, x2 = 6, y2 = 8;

        double distance = euclideanDistance(x1, y1, x2, y2);
        double[] line = equationOfLine(x1, y1, x2, y2);

        System.out.println("Euclidean Distance = " + distance);
        System.out.println("Equation of line: y = " + line[0] + "x + " + line[1]);
    }

    public static double euclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] equationOfLine(int x1, int y1, int x2, int y2) {
        double m = (double)(y2 - y1) / (x2 - x1);  // slope
        double b = y1 - m * x1; // intercept
        return new double[]{m, b};
    }
}

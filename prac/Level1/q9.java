package prac.Level1;

import java.util.Scanner;

public class q9 {
    public static int[] distributeChocolates(int chocolates, int children) {
        int each = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{each, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter chocolates: ");
        int choco = sc.nextInt();
        System.out.print("Enter children: ");
        int children = sc.nextInt();

        int[] dist = distributeChocolates(choco, children);
        System.out.println("Each child gets = " + dist[0] + ", Remaining = " + dist[1]);
    }
}

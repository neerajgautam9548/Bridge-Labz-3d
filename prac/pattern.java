package prac;
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		int f=1;
		for(int i=1;i<=x;i++) {
			f=f*i;
		}
		System.out.println(f);
	}
}

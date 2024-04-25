package Assignment;

import java.util.Scanner;

public class P_001 {
	
//	1.	W.A.J.P to Take three numbers from the user and print the greatest number. 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a = ");
		int a = sc.nextInt();
		System.out.println("b = ");
		int b = sc.nextInt();
		System.out.println("c = ");
		int c = sc.nextInt();
		
		if(a > b && a > c) {
			System.out.println("Greatest number is =" + a);
		}
		if(b > a && b > c) {
			System.out.println("Greatest number is =" + b);
		}
		
		if(c > a && c > b) {
			System.out.println("Greatest number is =" + c);
		}
	}
}

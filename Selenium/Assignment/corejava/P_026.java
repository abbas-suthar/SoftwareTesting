package Assignment;

import java.util.Scanner;

public class P_026 {
//	26.	W.A.J.P. which will ask the user to enter his/her marks (out of 100). 
//	Define a method that will display grades according to the marks 
//	entered as below: Marks Grade 91-100 AA 81-90 AB 71-80 BB 61-70 BC 51-60 CD 41-50 DD <=40 Fail
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks : ");
		int m = sc.nextInt();
		if (m <= 40) {
			System.out.println("You Are Fail");
		} else if (m > 40 && m <= 50) {
			System.out.println("Grade : DD");
		} else if (m >= 51 && m <= 60) {
			System.out.println("Grade : CD");
		} else if (m >= 61 && m <= 70) {
			System.out.println("Grade : BC");
		} else if (m >= 71 && m <= 80) {
			System.out.println("Grade : BB");
		} else if (m >= 81 && m <= 90) {
			System.out.println("Grade : AB");
		} else if (m >= 91 && m <= 100) {
			System.out.println("Grade : AA");
		} else {
			System.out.println("invalid input");

		}
	}
}

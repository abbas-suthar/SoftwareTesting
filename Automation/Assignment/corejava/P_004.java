package Assignment;

import java.util.Scanner;

public class P_004 {
	
//	4.	W.A.J.P to check given number is Prime or not?
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		for(int i=2;i*i<=n;i++) {
            if(n % i == 0) {
                System.out.println("is not prime");
                return;
            }
        }
        
        System.out.println("is prime number");
    }
}


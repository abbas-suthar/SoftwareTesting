package Assignment;

import java.util.Scanner;


public class P_003 {
	
//	3.	W.A.J.P to find factorial for Given Number. 
	
	public static void main(String[] args) {
		
		int n , fact =1;
		System.out.println("Enter any number : ");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		
		for (int i=1; i<=n; i++)
		{
			fact = fact*i;
			
		}
		System.out.print("factorial of given number is "   +  fact);
	}
	
	
}


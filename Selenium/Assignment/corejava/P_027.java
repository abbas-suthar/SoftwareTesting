package Assignment;

import java.util.Scanner;

public class P_027 {
//	27.	W.A.J.P. to create a custom exception if Customer withdraw amount 
//	which is greater than account balance then program will show 
//	custom exception otherwise amount will deduct from account balance. 
//	Account balance is:2000 Enter withdraw amount:2500 Sorry, 
//	insufficient balance, you need more 500 Rs.To perform this transaction.
	
	public static void main(String[] args) {
		int balance=2000;
		
		System.out.println("Enter amount you want to withdraw : ");
		Scanner sc= new Scanner(System.in);
		int withdrawAmount = sc.nextInt();
		if(withdrawAmount> balance) {
			System.out.println("So Sorry, insufficient balance.You need more 500 rs to perform this transaction.");
		}else {
			balance = balance- withdrawAmount;
			System.out.println("withdraw sucessful");
		}
	}

}

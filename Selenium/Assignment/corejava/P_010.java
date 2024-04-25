package Assignment;

import java.util.Scanner;

public class P_010 {
//	10.	WAP to calculate the average value of array elements
	public static void main(String[] args) {
		int a[]=new int[3]; int sum=0; double avg;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter elements of array : ");
		for(int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array elements ");
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]+ " ");
			sum=a[i]+sum;
			}
		System.out.println("sum of array element : "  +sum);
	avg = sum/3;
	System.out.println("Avg of array element : "  +avg);
		
	
		
		
	}
}



package Assignment;

import java.util.Scanner;

public class P_024 {

//	24.	WAP to find the second largest element in an array
	public static void main(String[] args) {
        int[] arr = {10, 5, 80, 31, 30};
        
        int larg=0 ;
        int secondLargest=0 ;
        
        for (int num : arr) {
            if (num > larg) {
                secondLargest = larg;
                larg = num;
            } else if (num > secondLargest && num != larg) {
                secondLargest = num;
            }
        }
        
        if (secondLargest == 0) {
            System.out.println("There is no second largest element.");
        } 
        else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}



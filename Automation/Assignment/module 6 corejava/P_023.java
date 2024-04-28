package Assignment;

public class P_023 {
//	23.	WAP to reverse an array of integer values. 
	public static void main(String[] args) {
	  int[] arr = {1, 2, 3, 4, 5};
		        
	  System.out.println("Original array:");
	  
	  for (int num : arr) {
          System.out.print(num + " ");
      }
      System.out.println();
  
  
		        
	  int a = 0;
      int b = arr.length - 1;
      
      while (a < b) {
          int temp = arr[a];
          arr[a] = arr[b];
          arr[b] = temp;
          a++;
          b--;
      }
		        
		        System.out.println("\nReversed array:");
		        
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		        System.out.println();
		    }
     }



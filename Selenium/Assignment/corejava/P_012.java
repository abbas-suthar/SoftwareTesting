package Assignment;


public class P_012 {
//	12.	WAP to find the maximum and minimum value of an array. 
	public static void main(String[] args) {
		
	int a[] = { 23, 26, 89, 84, 65 };
	int max = a[0];
		for(
		int i = 1;i<a.length;i++)
		{
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("maximum value of array is:" +max);
			int b[] = {30,20,10,40,50};
			int min= b[0];
			for (int i=1;i<b.length;i++)
				{ 
				if (b[i] < min) {
					min =b[i];
				}
				
			}
			System.out.println("Minimum value  of array is :" +min);
			
	}


}

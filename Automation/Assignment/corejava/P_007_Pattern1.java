package Assignment;

public class P_007_Pattern1 {
//	7.	W.A.J.P to Print pattern Given Below.
	
	public static void main(String[] args) {
		for (int row=1; row<=5; row++) {
			
			for (int column=1; column<=row;column++) {
				System.out.print(column+ " ");
			}
			System.out.println();
			}
		
	}

}

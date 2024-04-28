package Assignment;

public class P_015 {
//	15.	WAP to demonstrate try catch block. 
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println("cannot divide by 0 ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("given value of index is  out of limit");
		} catch (Exception e) {
			System.out.println("Something  went Wrong..");
		}
		System.out.println("furthur code continue..");
	}

}

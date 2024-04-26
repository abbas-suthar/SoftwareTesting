package Assignment;

	//	25.	W.A.J.P. Create an abstract class 'Parent' with a method 'message'. 
	//	It has two subclasses each having a method with the same name 'message' that prints 
	//	"This is first subclass" and "This is second subclass" respectively. 
	//	Call the methods 'message' by creating an object for each subclass.
	
abstract class Parent {

	public abstract void message();

}

class FirstSubclass extends Parent {

	public void message() {

		System.out.println("This is first subclass");

	}
}

	class SecondSubclass extends Parent {

		public void message() {

			System.out.println("This is second subclass");

		}
	}

		public class P_025 {
			public static  void main(String[] args) {
				FirstSubclass obj1 = new FirstSubclass();
				SecondSubclass obj2 = new SecondSubclass();
				obj1.message();
				obj2.message();
			}
		 }
		



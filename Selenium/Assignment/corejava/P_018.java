package Assignment;


//	18.	WAP to create one thread by extending Thread class in another Class.
		
	class MyThread extends Thread {
	    public void run() {
	        System.out.println("Thread is running.");
	    }
	}
	

	    public class P_018{
	    
	    public static void main(String[] args) {
	        MyThread myThread = new MyThread();
	        myThread.start(); 
	    }
	
}
	
	
		

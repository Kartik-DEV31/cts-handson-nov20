package multithreading;

public class ThreadMain {
	
	public static void main(String...strings) {
		Counter counter = new Counter();
		
		Thread t1 = new Thread(counter);
		Thread t2 = new Thread(counter);
		
		
	  t1.start();
		t2.start();
		
		System.out.println("Program Ended.");
		
		
	}
	
	
	

}

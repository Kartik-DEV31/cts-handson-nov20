package multithreading;

public class Counter implements Runnable {
	
	@Override
	public void run() {
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Counter : "+i);
			
		}
		
	}
	

}

package multithreading;

public class Counter implements Runnable {
	
	@Override
	public  void run() {
	Thread t  =	Thread.currentThread();
		for (int i = 0; i < 100; i++) {
			System.out.println("Counter : "+i+" Thread Name :"+t.getName());
			
		}
		
	}
	

}

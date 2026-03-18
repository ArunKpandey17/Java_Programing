package Multithread;

public class myThread extends Thread {
	@Override
	public void run() {
		//System.out.println("thread call executed"
			//	+  "   2012    ");
		
		for (int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
		
	}
	
	
	
	


public static void main(String []args) {
	myThread t1 = new myThread();
	t1.start();
	try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("join method executed");
}
}
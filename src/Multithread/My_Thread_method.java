package Multithread;

public class My_Thread_method extends Thread {
	
	
	
	@Override
	public void run() {
		 for(int i=0;i<=5;i++) {
			 
			 
			System.out.println ("runing" );
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		 }
	}

	public static void main(String[] args) {
		 My_Thread_method t = new My_Thread_method();
		 t.start();
	}

}

package Multithread;








class main extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
			System.out.println("Even: "+(i));	}
			}
	}
	
}

public class Even_odd_runable{
	public static void main(String []args) {
	main ty = new main();
       ty.run();

for(int i=1;i<=10;i++) {
	if(i%2!=0) {
		System.out.println("Odd: "+(i));
	}
}
	
}
}


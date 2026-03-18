
/*
 * write a program for following :
create a write a program for following :
create a multithread application in which even number from 1 to 10 and odd number from 1 to 10 or printed contracted.
solve a problem in three method :
1.extend thread 
2.implement runnable 
3.performing functional programming by using functional interface runnable and lambda expression.

   */



package Multithread;

class Mythread extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
			System.out.println("Even: "+(i));	}
			}
	}
	
}

public class Even_Odd{
	public static void main(String []args) {
	Mythread ty = new Mythread();
       ty.start();

for(int i=1;i<=10;i++) {
	if(i%2!=0) {
		System.out.println("Odd: "+(i));
	}
}
	
}
}


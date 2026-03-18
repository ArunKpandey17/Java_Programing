package Exceptions;

public class even_odd {
	static int num;
	public static void check_even_odd(int num) {
		try {
			if(num%2==0) {
				System.out.println("yes it is even");
			}
			else {System.out.println("yes it is odd");}
			}
			
				catch (ArithmeticException e) {
					 if (num==0)System.out.println("Exception find"+e.getMessage());
					
				}
			
		}
	
	public static void main(String []args) {
	check_even_odd(0);

}
	}

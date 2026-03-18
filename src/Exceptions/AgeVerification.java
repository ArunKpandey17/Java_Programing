package Exceptions;

public class AgeVerification {
	
	
	int age;
	static  public void voterights(int age ) {
		try {
			if(age>=18) {
				System.out.println("Eligible for voting");
			}
			else {
				System.out.println("Sorry not eligible for voting");
			}
		}
		
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		 
	 }
	public static void main(String[]args) {
		voterights(15);
		
	}

}

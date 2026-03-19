package Logical_programming;

import java.util.Scanner;


public class Sum_of_first_number {
	

	
	public static void getsum(int n) {
		int sum = n*(n+1)/2;
		System.out.println("Sum of first "+n+ " number = "+"  " +sum);
	}
	
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number ");
		
		getsum(sc.nextInt());
		
		
		
		
	}
	

}

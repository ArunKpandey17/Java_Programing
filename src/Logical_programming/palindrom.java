package Logical_programming;

import java.util.Scanner;

public class palindrom {
	public static void main(String[] args) {
		String s; 
		int reverse=0 ,c, reminder;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		s = sc.nextLine();
		String rev ="";

		for(int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
		}

		if (rev.equals(s)) {
			System.out.println("its a palindrom string");
		} else {
			System.out.println("its  not a palindrom string");
		}

	}
}

package Logical_programming;

import java.util.Scanner;

public class palindrom {
	public static void main(String[] args) {
		int num, reverse = 0, c, reminder;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		num = sc.nextInt();
		c = num=123;
		
		while (num > 0) {
			reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num = num / 10;

		}
         
		if (c == reverse) {
			System.out.println("its a palindrom number");
		} else {
			System.out.println("its  not a palindrom number");
		}

	}
}

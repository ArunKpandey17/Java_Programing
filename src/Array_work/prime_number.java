package Array_work;

import java.util.Scanner;

public class prime_number {
	public static void main(String[] args) {

		int n;
		int count = 0;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("its a prime");
		} else {
			System.out.println("its not a prime");

		}
	}
}

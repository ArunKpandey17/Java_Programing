package Logical_programming;

import java.util.Scanner;

public class Sentancerev {
	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		String arr[] = s.split(" ");
		String name = "";

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				name= name+(arr[i].charAt(j));
			}
			System.out.print(name+" ");
			name="";

		}
		
	}
}

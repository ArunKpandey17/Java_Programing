package Logical_programming;
import java.util.Scanner;
public class chardivide {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String");
			String str= sc.nextLine();
		
		String s = " ";
		for (int i = 0; i <= str.length() - 1; i++) {

			if ((str.charAt(i) != ' ')) {
				s = s + str.charAt(i);
			} else {
				for (int j = s.length() - 1; j >= 0; j--) {
					System.out.print(s.charAt(j));
				}
				System.out.print(" ");
				s = "";
			}
			

		}
		
		for (int j = s.length() - 1; j >= 0; j--) {
			System.out.print(s.charAt(j));
		}

	}

}

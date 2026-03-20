package Logical_programming;
import java.util.Scanner;
public class Sentancerev {
	public static void main(String []arg) {
	String s;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String");
	s=sc.nextLine();
	for(int i=s.length()-1;i>=0;i--) {
		System.out.print(s.charAt(i));
	}
	
	
	
}
}

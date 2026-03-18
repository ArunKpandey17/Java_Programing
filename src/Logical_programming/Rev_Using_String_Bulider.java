package Logical_programming;
import java.util.Scanner;
public class Rev_Using_String_Bulider {
   
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		
		sb.append(str);
		sb.reverse();
		
		System.out.println(sb);
	}
	
	
	
}

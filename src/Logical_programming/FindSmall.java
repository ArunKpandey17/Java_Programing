package Logical_programming;
import java.util.Scanner;

public class FindSmall {
    public static void findsmallNum(int a,int b ,int c){
        if(a<b && a<c){System.out.println(a+  "is smallest");}
        else if(b<a && b<c){System.out.println(b+ "is smallest");}
        else if(c<a && c<b){System.out.println(c+ "is smallest");}
        else if (a==b && b==c){System.out.println("Number are equal");}
        else{System.out.println("invalid input");}
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check the Smallest Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        findsmallNum(a, b, c);
    }
	public static void main(String[] args) {
	
	}
}

package Logical_programming;
import java.util.Scanner;

public class LeapYear {
    public static void isLeapYear(int num){
        if (num%400==0){System.out.println("Leap Year");}
        else if(num%4==0){System.out.println("Leap Yaer");}
        else if (num%100==0){System.out.println("Leap Year");}
        else {System.out.println("Not a Leap Year");}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("is Leap Year: ");
        int num = sc.nextInt();
        isLeapYear(num);
    }
}

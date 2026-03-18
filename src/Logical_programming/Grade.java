package Logical_programming;
import java.util.Scanner;

public class Grade {
    public static void checkGrade(int num){
       
      if(num>90 && num<100){System.out.println("Grade A");}
      else if(num>75 && num<89){System.out.println("Grade B");}
      else if (num>50 && num<74){System.out.println("Grade C");}
      else if(num<50) {System.out.println("Fail");}
      else {System.out.println("Invalid Input");}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a marks:");
        int num = sc.nextInt();
        checkGrade(num);
    }
}

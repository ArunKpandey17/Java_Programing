package Logical_programming;
import java.util.Scanner;

public class NumberRange {
    public static void checkNumberRange(int num){
        if(num>=1 && num<=100){System.out.println(num+   "Number is in range");}
        else{System.out.println(num+    "Number is out of range");}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check a range");
        int num = sc.nextInt();
        checkNumberRange(num);
    }
}

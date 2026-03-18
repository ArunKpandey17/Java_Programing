package Logical_programming;
import java.util.Scanner;

public class CheckNum {
    public static void checkZero(int num){
        if(num==0){System.out.println(num+   "Number is Zero");}
        else {System.out.println(num+   "Number is not a Zero");}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkZero(num);
    }
}

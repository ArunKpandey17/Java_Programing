package Logical_programming;
import java.util.Scanner;

public class CompareNumber {
    public static void comNumber(int a ,int b){
        if (a==b) {System.out.println("Both are equal");}
            else if(a>b){System.out.println(a+ "is Greater");}
        else {System.out.println(b+ "is Greater");}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();

        comNumber(a,b);
    }
}

package Logical_programming;
import java.util.Scanner;

public class Sum {
    public void processSum(int a, int b){
        if (a>b || a==b){System.out.println("Product of these no. :"+(a+b));}
        else {System.out.println("Sum");}
    }
    public static void main(String[] args) {
        Sum s1 = new Sum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Process : ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        s1.processSum(a,b);
    }
}

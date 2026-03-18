package Logical_programming;
import java.util.Scanner;

class Prime {
     static String isPrime(int num){
        if(num%num==0)
        return "its a prime number";
        else return "not a prime number";

     }
     public static void main(String[] args) {
        
        Scanner S1 = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=S1.nextInt();
        System.out.println(isPrime(52));
     }
}

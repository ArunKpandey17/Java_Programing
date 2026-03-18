package Logical_programming;
import java.util.Scanner;
class Add{    
     static int isSum(int num1,int num2,int num3 ){
             return num1+num2+num3;
}
    public static void main(String[] args) {
  
Scanner sc = new Scanner(System.in);
 int num1 = sc.nextInt();
 int num2 = sc.nextInt();
 int num3 = sc.nextInt();
     int result = isSum(num1,num2,num3);
     System.out.println("Tha sum of"+"num1 "+"num2 "+"num3 is ="+result);


}
    
}
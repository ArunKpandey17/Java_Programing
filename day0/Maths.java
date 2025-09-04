/*Class MathUtility with a static method getSquare(int num) that returns
the square.
Class MathApplication with a static method showResult() that accesses
MathUtility.getSquare() using the class name./* */

import java.util.Scanner;

class Maths{
public static void main(String[] args) {
  
    MathApplication mt = new MathApplication();
    mt.showResult();
}
}

class MathApplication{
    int num;
    public static double getSquare(int num){
        double  square = num*num;
          return square;
      }
    public static void showResult(){
      
        System.out.println("Enter a Number:");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("square of number is:"+ getSquare(n));
    }
}

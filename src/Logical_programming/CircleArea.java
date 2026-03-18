  


package Logical_programming;
import java.util.Scanner;
public class CircleArea{
     static double r;
    public static double  areaofCircle( double input){
         double area=((Math.PI)*r*r) ;

        System.out.printf("Area of the circle: %.2f\n", +area);
        return area;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        areaofCircle(input);
    }
}
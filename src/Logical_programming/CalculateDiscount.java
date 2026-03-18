 package Logical_programming;
 
class Sample{
    double price;
    double percentage;

     public double calculateDiscount(double price, double percentage){
      return price-price*percentage/100;

     }
}














public class CalculateDiscount {
    public static void main(String[] args) {
       Sample s1 = new Sample();
       System.out.println("Final price: "+s1.calculateDiscount(100, 10)); 
    }
}

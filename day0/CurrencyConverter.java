/*Class CurrencyConverter with a static method getDollarRate() returning
conversion rate.
Class TravelAgency with a non-static method displayConversionRate() that
accesses CurrencyConverter.getDollarRate() using the class name.*/

import java.util.Scanner;
public class CurrencyConverter{
    public static void main(String[] args) {
        TravelAgency T1=new TravelAgency();
        T1.displayConversionRate();
    }
} 
 class TravelAgency {

 public static float getDollarRate(float num){
         float ConversionRate = num * 81;
         return ConversionRate;
    }
    public void  displayConversionRate(){
     System.out.println("Enter a number:");
     Scanner sc =new Scanner(System.in);
     float n= sc.nextFloat();
     System.out.println("NIR Convert into Doller:"+getDollarRate(n));
    }
    
}
   

package Logical_programming;

public class TemperatureConverter {
   
    public double convertToFahrenheit(double celsius){
    return  celsius*(9/5)+32;
    }
    public static void printConvertedTemperature(){
        TemperatureConverter c1 = new  TemperatureConverter();
        double fer =  c1.convertToFahrenheit(12);
        System.out.println("converted to farenhite:"+fer);
        
    }
      public static void main(String[] args) {
        
        printConvertedTemperature();
       
    }
}

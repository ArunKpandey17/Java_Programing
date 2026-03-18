package Logical_programming;
class Temp{
    private double celsius;
     public void setCelsius(double celsius){
        this.celsius=celsius;
     }
     public double getCelsius(){
        return celsius;
     } 

     public double calfera( ){
        double fahrenheit;
        return (fahrenheit = (celsius * 9/5) + 32);
     }
      

     public String toString(String fahrenheit){
        return "The Fahrenheit temperature should be :"+fahrenheit;
     }
}









public class Wapper {
    public static void main(String[] args){
        Temp t1 = new Temp();
        t1.setCelsius(32);
        System.out.println(t1);
        
    }
}

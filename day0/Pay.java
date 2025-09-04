import java.util.Scanner;

public class Pay{
    static double HRA;
    static double totalsalary;
    public  double calculateHRA(double salary){
         
         double hra1 = salary*0.25;
         calculateNetSalary( hra1);
         return hra1;
         
    }
    public static void calculateNetSalary(double HRA){
       double totalsalary= salary+HRA;
        System.out.println("Your Total salary:"+totalsalary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          Double salary = sc.nextDouble();
        Pay P1 = new Pay();
        double hra2 = P1.calculateHRA(salary);
        System.out.println("HRA IS "+hra2 ); 
       
    }
    
}

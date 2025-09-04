 class Customer{
    private  String customerName;
    private  String monthlySpending;

    public  void  setcustomerName(String customerName){this.customerName=customerName;}
    public String getcustomerName(){ return customerName;}
    public void setmonthlySpending(String monthlySpending){this.monthlySpending=monthlySpending;}
    public String getmonthlySpending(){return monthlySpending;}
     
    public String displayDetails(String customerName,String monthlySpending){
        return  " cutomer name is"+customerName +" Monthlyspending"+monthlySpending;
    }
}
 class Name{
    private String cardname;
    private String cardtype;
public void setCardname(String cardname){this.cardname=cardname;}
public static String getCardtype(String cardtype){
    if(m1.monthlySpending<10000){return Silver};
     else if(m1.monthlySpending>=10000 && m1.monthlySpending<=50000){return Gold};
     else return Platinum;


}
 }

 public class CustomerTest{
      public static void main(String[] args) {
        Customer m1 = new Customer();
        m1.getcustomerName("Arun");
        m1.getmonthlySpending("14000");
      }
 }

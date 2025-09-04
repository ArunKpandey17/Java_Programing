class RentCostCal {
    private String CarModal;
    private int rentalDays;
    private double dailyRate;
      

   public void setrentalDays(int rentalDays){
    this.rentalDays=rentalDays;
   }
   public int getrentalDays(){
      return rentalDays;
   }
   public void setDailyRate(double dailyRate){
    this.dailyRate=dailyRate;
   }
   public double getdailyRate(){
    return dailyRate;
   }
   public double calculateTotalCost(){
    if(rentalDays>7){
     
       return (dailyRate*rentalDays)-(dailyRate*rentalDays)*0.10;
      }
    else return dailyRate*rentalDays;
   }
   public   void setCarModal(String CarModal){
    this.CarModal=CarModal;
   }
   public String getCarModald(){
    return CarModal;
   }
}


public class CarRentalCalcutator{
     public static void main(String[] args) {
      RentCostCal f1= new RentCostCal();
       f1.setCarModal("KIA");
       f1.setDailyRate( 8);
       f1.setrentalDays(9);
         System.out.println("Total Rent are:"+f1.calculateTotalCost());
       System.out.println(" Name of car:"+f1.getCarModald());
       System.out.println("DailyRate of car:"+f1.getdailyRate());
       System.out.println("Day of Rent:"+f1.getrentalDays());
       
     }
}


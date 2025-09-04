class Vehicle{
    String make;
    String modal;
    int year;
     
    Vehicle(String make,String modal,int year){
        this.make=make;
        this.modal=modal;
        this.year=year;
    }
    public void displayDetails(){
        System.out.println("Make:"+make);
        System.out.println("Modal:"+modal);
        System.out.println("Year:"+year);
    }
}
 class Car extends Vehicle{
    int numberOfDoors;
    Car(String make, String modal, int year, int numberOfDoors){
        super(make,modal,year);
        this.numberOfDoors=numberOfDoors;
    }
    public void displayDetails(){
        System.out.println("Make:"+make);
        System.out.println("Modal:"+modal);
        System.out.println("Year:"+year);
        System.out.println("Number of Door: "+numberOfDoors);
    }
 }
 class Bike extends Vehicle{
    String type;
    Bike(String make, String modal, int year, String type){
        super(make,modal,year);
        this.type=type;
    }
    public void displayDetails(){
        System.out.println("Make:"+make);
        System.out.println("Modal:"+modal);
        System.out.println("Year:"+year);
        System.out.println("Type:"+type);
    }
 }  
public class Test1 {
    public static void main(String[] args) {
        System.out.println("Car Details: ");
      Car c1= new Car("BMW", "Q8", 2025,  3);
      c1.displayDetails();  
  System.out.println("Bike Details:");
      Bike b1= new Bike("Gt","650",2025,"Royle");
      b1.displayDetails();
    }
}

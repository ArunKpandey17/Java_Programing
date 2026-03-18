
package Logical_programming;
import java.util.Scanner;
class Payment{
public static void verifyOTP(int otp){
//
}
public static void pay(UPI u){
    String uid = u.upiID;
if(uid.endsWith("@ybl")||uid.endsWith("@oksbi")||uid.endsWith("@axl")){
System.out.println("Payment successful");
}
else{
System.out.println("Invalid UPI.Try Again");
}
}
public static void pay(Card c){
long digit=0;
int count=0;
//count no. of digits in card then verify
do{
digit = c.cardNo % 10;
count++;
c.cardNo = c.cardNo / 10;
}
while(c.cardNo!=0);  
                              //leaving card expiry verification for next build
if(count==16 && c.cvv >99 && c.cvv<=999){
System.out.println("Valid Card");
//....leaving OTP verification for next build
//verifyOTP();
System.out.println("Payment Done Successfully");
}
else{
System.out.println("Invalid Card.Try Again");
}
}
}
class Card{
String cardHolderName;
long cardNo;
int cvv;
String date;
}

class UPI
{
    String upiID;
    int upiPin;
} 
class TestPayment{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your choice of payment: ");
    int choice = sc.nextInt();
    sc.nextLine();
    if(choice == 1){
Card debitCard = new Card();
System.out.println("Enter card no.: ");
debitCard.cardNo = sc.nextLong();
sc.nextLine();
System.out.println("Enter card holder name: ");
debitCard.cardHolderName = sc.nextLine();
System.out.println("Enter CVV: ");
debitCard.cvv = sc.nextInt();
Payment.pay(debitCard);
    }
    else if(choice == 2){
UPI phonePe = new UPI();
System.out.println("Enter your UPI ID: ");
phonePe.upiID = sc.nextLine();
System.out.println("Enter UPI pin: ");
phonePe.upiPin = sc.nextInt();
Payment.pay(phonePe);
}
else{
System.out.println("Invalid choice ");
}
}
}
/*Class BankAccount with a non-static method getBalance() returning
account balance.
Class BankSystem with a static method printBalance() that creates an
object of BankAccount and accesses getBalance().*/
    

package Basic_work;

class BankAccount {
  static long balance=10000L;
  public  Long getBalance(){
       
        return balance;
    }
  
}

 public class BankSystem{

    public static void main(String [] args){
            printBalance();
    }
        public  static void  printBalance(){
        
         BankAccount B1 = new BankAccount();
         long balance = B1.getBalance();
        System.out.println(" Account Balance 2:"+balance);

    }
   
}

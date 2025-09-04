/*Class BankAccount with a non-static method getBalance() returning
account balance.
Class BankSystem with a static method printBalance() that creates an
object of BankAccount and accesses getBalance().*/
public class BankAccount {

    Long getBalance(long balance){
         balance=10000L;
        return balance;
    }
    public static void main(String[] args) {
        BankAccount B1=new BankAccount();
        long balance = B1.getBalance();
        System.out.println("Account Balance :"+balance);
    }
}

class BankSystem{
    public  static void printBalance(){
        
        System.out.println(" Account Balance:"+B1.getBalance());

    }
}

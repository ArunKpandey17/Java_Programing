/*An e-commerce platform supports multiple payment methods (Credit Card, PayPal, UPI).
The payment system must be flexible and allow adding more methods in the future
without changing the core logic.

Requirements:

- Define a Payment interface with a method processPayment(double amount).
- Implement this interface in three classes: CreditCardPayment, PayPalPayment,
   and UPIPayment.
- Create a CheckoutService class that accepts any Payment implementation to
  perform the transaction.


 */
package Interface_work;
interface e_dukan {
    void payment(double amount);

}

class CC implements e_dukan {
    int CCnum = 145445487;

    @Override
    public void payment(double amount) {
        System.out.println("payment using CC"+amount);

    }

    public void pay() {
        System.out.println(" CC number : " + CCnum);

    }
}

class UPI implements e_dukan {
    String upi_id;

    @Override
    public void payment(double amount) {
        System.out.println("Payment using uip id"+amount);
    }

    public void pay(String upi_id) {
        System.out.println("UPI Id : " + upi_id);
    }

}

class paypal implements e_dukan {
    @Override
    public void payment(double amount) {
        System.out.println("Payment using PayPal"+amount);
    }
}
class Check{
public static   void CheckoutService(e_dukan c1){
    c1.payment(4500);
}
}
public class Dukan {
    public static void main(String[] args) {
        
   e_dukan  c1 = new CC();
   e_dukan  u1 = new UPI();
   e_dukan  p1 = new paypal();
        Check.CheckoutService(c1);
        Check.CheckoutService(u1);
        Check.CheckoutService(p1);
    }
}

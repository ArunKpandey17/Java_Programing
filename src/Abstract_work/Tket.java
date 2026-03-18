package Abstract_work;
abstract class Ticket {
    int ticketno;
    int price;

    Ticket(int ticketno, int price) {
        this.ticketno = ticketno;
        this.price = price;
    }

    public void printticket() {
        System.out.println("Ticket Number : " + ticketno + " Base Price : " + price);

    }

    public abstract void calculatefinalprice();

}

class flight extends Ticket {
    String name;

    flight(int ticketno, int price, String name) {
        super(ticketno, price);
        this.name = name;
    }

    @Override
    public String toString() {
        printticket();
        return "";
    }

    @Override

    public void calculatefinalprice() {
        System.out.println("Final price of Ticket After Tax  " + price);

    }
}

public class Tket {
    public static void main(String[] args) {
        flight f1 = new flight(125, 1200, "Indigo");
        System.out.println(f1);
        f1.calculatefinalprice();

    }

}

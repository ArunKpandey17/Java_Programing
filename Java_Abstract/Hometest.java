abstract class home {
    String brand;
    int watt;

    home(String brand, int watt) {
        this.brand = brand;
        this.watt = watt;
    }

    public void applianceOn() {
        System.out.println(brand + "  appliance is ON ");
    }

    public abstract void calculaterate();

    public void applianceOff() {
        System.out.println(brand + "  appliance is Off  ");
    }

}

class WashingMachine extends home {
    int hours;

    WashingMachine(String brand, int watt, int hours) {
        super(brand, watt);
        this.hours = hours;
    }

    @Override
    public String toString() {
        applianceOn();
        applianceOff();
        return "";
    }

    @Override
    public void calculaterate() {
        System.out.println("  Energy consumed in  " + hours + "hours:" + watt * hours + "in kWh");
    }

}

class Ac extends home {
    int hours;

    Ac(String brand, int watt, int hours) {
        super(brand, watt);
        this.hours = hours;
    }

    @Override
    public String toString() {
        applianceOn();
        applianceOff();
        return "";
    }

    @Override
    public void calculaterate() {
        System.out.println("  Energy consumed in  " + hours + "hours:" + watt * hours + "in kWh");

    }
}

public class Hometest {
    public static void main(String[] args) {
        WashingMachine w1 = new WashingMachine("LG", 120, 2);
        System.out.println(w1);
        w1.calculaterate();

        Ac a1 = new Ac("Samsung", 500, 14);
        System.out.println(a1);
        a1.calculaterate();
    }
}

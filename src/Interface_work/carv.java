


package Interface_work;
interface Vechile {
    void start();

    void stop();

    int maxspeed = 125;
}

class car implements Vechile {
    @Override
    public void start() {
        System.out.println("Car Started");

    }

    @Override
    public void stop() {
        System.out.println("Car Stoped");
    }

    public void hook() {
        System.out.println("beep beep ");
    }
}

public class carv {
    public static void main(String[] args) {
        car c1 = new car();
        c1.start();
        c1.hook();
        System.out.println("max speed of car : " + Vechile.maxspeed);

        c1.stop();

    }
}
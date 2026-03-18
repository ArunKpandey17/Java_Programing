   
package Logical_programming;


class test {

    public String twoInterger(int a, int b) {
        return "" + a * b;
    }

    public String threeInteger(int a, int b, int c) {
        return "" + a * b * c;
    }

    public double twoDouble(int a, int b) {
        return a * b;
    }

    public double threeDouble(int a, int b, int c) {
        return a * b * c;
    }

}

public class Calculater {
    public static void main(String[] args) {
        test t2 = new test();
        System.out.println("multiply of two integer:  "+t2.twoInterger(5, 5));
        System.out.println("multiply of three integer:  "+t2.threeInteger(5, 5, 4));
        System.out.println("multiply of two Double :  "+t2.twoDouble(125, 121));
        System.out.println("multiply of two Double :  "+t2.threeDouble(111, 222, 333));
    }
}

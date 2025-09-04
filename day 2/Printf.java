class Print {
    String data;

    public void printdata(String data) {
        System.out.println("invoke info");
    }
}

class Excle extends Print {
    @Override
    public void printdata(String data) {
        System.out.println("  exzle invoke info");
    }

}

class PDF extends Print {
    @Override

    public void printdata(String data) {
        System.out.println("  PDF  invoke info");
    }

}

class HTML extends Print {
    @Override
    public void printdata(String data) {
        System.out.println(" <p> HTML invoke info </p>");
    }
}

public class Printf {
    public static void main(String[] args) {
        Print p1 = new Excle();
        p1.printdata("info");
        Print p2 = new PDF();
        p2.printdata("PDF");
        Print p3 = new HTML();
        p3.printdata("HTML");
    }
}



package String_work;

class Dukan {
    private String title;
    private String author;
    private String ISBN;
    private double price;
    private double discountPercentage;
    double finalPrice;

    public void settitle(String title) {
        this.title = title;
    }

    public String gettitle() {
        return title;
    }

    public void setauthor(String author) {
        this.author = author;
    }

    public String getauthor() {
        return author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public double getprice() {
        return price;
    }

    public void setdiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getdiscountPercentage() {
        return discountPercentage;
    }

    public double getfinalprice(double finalPrice) {
        finalPrice = price - (price * discountPercentage / 100);
        return finalPrice;
    }

}

public class Book {
    public static void main(String[] args) {

        Dukan s1 = new Dukan();
        s1.setauthor("Arun");
        s1.settitle("hara whi to lada nahi");
        s1.setISBN("azsx");
        s1.setprice(1200);
        s1.setdiscountPercentage(5);

        System.out.println("All information of Book are :");
        System.out.println("Author of book is :" + s1.getauthor());
        System.out.println("Title of book is :" + s1.gettitle());
        System.out.println("ISBN of book is :" + s1.getISBN());
        System.out.println("Price of book is :" + s1.getprice());
        System.out.println("Discount on book is :" + s1.getdiscountPercentage());
        System.out.println("Final Price of book is:" + s1.getfinalprice(s1.getdiscountPercentage()));
    }
}
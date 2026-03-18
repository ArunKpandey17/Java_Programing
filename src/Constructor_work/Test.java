package Constructor_work;
class Book {
    String title;
    String Author;

    Book(String title, String Author) {
        this.title = title;
        this.Author = Author;
    }
}

class LibaryBook extends Book {
    int selfno;

    LibaryBook(String title, String Author, int selfno) {
        super(title, Author);
        this.selfno = selfno;

    }

}

public class Test {
    public static void main(String[] args) {
        LibaryBook l1 = new LibaryBook("12fail", "Anurag Pathak", 12);
        System.out.println("Name of Book : " + l1.title);
        System.out.println("Author of this book : " + l1.Author);
        System.err.println("In libary which self that of :" + l1.selfno);
    }
}

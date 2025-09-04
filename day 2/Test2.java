
class Student {
    String name;
    int rollno;

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;

    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
    }

}

class ScienceStudent extends Student {
    private int physicsMarks;
    private int chemistryMarks;
    private int mathMarks;

    ScienceStudent(String name, int rollno, int Pm, int Cm, int Mm) {
        super(name, rollno);
        this.physicsMarks = Pm;
        this.chemistryMarks = chemistryMarks;
        this.mathMarks = mathMarks;
    }

    public float calculatepercentage() {
        return physicsMarks + chemistryMarks + mathMarks / 3;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Physics Marks:" + physicsMarks);
        System.out.println("MATHS Marks:" + mathMarks);
        System.out.println("CHEMISTRY Marks:" + chemistryMarks);
        System.out.println("Percentage: " + calculatepercentage());
    }

}

class ArtStudent extends Student {
    private int historyMarks;
    private int geographyMarks;
    private int englishMarks;

    ArtStudent(String name, int rollno, int Hm, int Gm, int Em) {
        super(name, rollno);
        this.historyMarks = historyMarks;
        this.geographyMarks = geographyMarks;
        this.englishMarks = englishMarks;
    }

    public float calculatepercentage() {
        return historyMarks + geographyMarks + englishMarks / 3;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("History Marks:" + historyMarks);
        System.out.println("English Marks:" + englishMarks);
        System.out.println("Geo Marks:" + geographyMarks);
        System.out.println("Percentage: " + calculatepercentage());
    }
}

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Science Student Deatils:");
        ScienceStudent s1 = new ScienceStudent(null, 0, 0, 0, 0);
        s1.displayDetails();
        s1.calculatepercentage();
        System.out.println("Art Student Detalis: ");
        ArtStudent a1 = new ArtStudent("Satyam", 45, 55, 99, 99);
        a1.displayDetails();
        a1.calculatepercentage();
    }

}

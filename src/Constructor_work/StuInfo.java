package Constructor_work;
class Student {
    String name;
    int age;
    static char Grade;

    Student(String name, int age, char c) {
        this.name = name;
        this.age = age;
        this.Grade = Grade;

    }

    public Student(String name2, int rollno) {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
        return "name :" + name + "age :" + age + "Grade :" + Grade;
    }
}

public class StuInfo {
    public static void main(String[] args) {
        
    
    Student s1 = new Student(" Arun " ,21 ,'A');
    System.out.println(s1);
}
}
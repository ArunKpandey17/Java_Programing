class Student {
    String name;
    int age;
    char Grade;

    Student(String name, int age, char Grade) {
        this.name = name;
        this.age = age;
        this.Grade = Grade;

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
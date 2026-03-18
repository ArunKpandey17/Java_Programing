package Logical_programming;
class Student{
    String name;
    static int totalmarks;
    float average;
    public String calculateGrade(int sub1,int sub2,int sub3,int sub4,int sub5){
        
        if(totalmarks>=90) return "Grade A";
        else return "Not Grade A";
        
    }
    public static void main(String[]args){
        Student S1 = new Student();
        S1.name="ram";
        S1.totalmarks = 92;
        S1.average=totalmarks/500*100;
        System.out.println("student grade :");
    }


}
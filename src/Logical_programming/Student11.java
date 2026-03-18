package Logical_programming;
class Student11{
    String name;
    int totalmarks;
    float average;
    public void calculateGrade(int totalmarks){};
        
               
    
    public static void main(String[]args){
        Student S1 = new Student();
        S1.name="Ram";
        S1.totalmarks = 95;
        S1.average = S1.totalmarks/500*100;
        if(S1.totalmarks>=90) {System.out.println("Grade A");}

    else System.out.println(" Not Grade A");
            
        
        System.out.println("Student Grade :");
    }


}
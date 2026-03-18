package Logical_programming;
class School{
    String username;
    int grade;
    float percentage;
    long marks;
    static float ate =78f;
    public static void main(String[]args){
        School S1 = new School();
        S1.username = "Arun";
        S1.grade = 12;
        S1.marks = 450;
        S1.percentage = 450/500*100;
        
        if(S1.percentage > 75){
            System.out.println("S1 is Eligible for scholership");
 } 
 else System.out.println("S1 is not Eligible for scholership");


    }

}

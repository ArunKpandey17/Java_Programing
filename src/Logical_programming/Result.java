package Logical_programming;
class Result{

  static String calculateGrade(int subject1,int subject2,int subject3,int subject4,int subject5) {
     int total = subject1+subject2+subject3+subject4+subject5;
     int avg = total/5;
      if( subject1 >0 && subject2 >0 && subject3 >0 && subject4>0 && subject5 >0){
           if( avg>=90 && avg<=100){
                return "Grade A ";
           }
           else if( avg>=80 && avg<=89){
               return "grade b";
           }
           else if( avg>=70 && avg<=79){
               return "grade c";
           }
           else if( avg>=50 && avg<=69){
               return  "grade d";
           }
           else{
               return " grade f";
           }
      }
      else{
        return "Negative Marks";
      }
}
public static void main(String args[]){
 int subject1 =85;
 int subject2 =90;
 int subject3 =78;
 int subject4 =88;
 int subject5 =92;
 String finalgrade = calculateGrade(subject1,subject2, subject3,subject4,subject5);
 System.out.println(finalgrade);
}
}
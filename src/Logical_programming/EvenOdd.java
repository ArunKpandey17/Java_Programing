package Logical_programming;
class EvenOdd{

static String isEvenOdd(int num){

if(num%2==0)
    return "yes it is even/True";

else return " not even number";
}

public static void main(String[]agrs){
int num=15;

System.out.println(isEvenOdd(num));

}

}
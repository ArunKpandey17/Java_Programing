package Logical_programming;
class Voter{
    
public static void  isEligible(int age) {
	int age1=15;
        if(age1 >= 18){
            System.out.println("Eligible for vote");

        } 
        else  System.out.println("not Eligible for vote");

    }


    public static void main(String[]args){
        int age= Integer.parseInt(args[0]);
        isEligible(age);

    }
}


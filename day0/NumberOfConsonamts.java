/*Write a program in Java to accept a String from the user. Pass the String
to a method which displays number of the consonants present in the String.*/ 


import java.util.Scanner;
class NumberOfConsonamts{
    
    public static String consonants(String input){
        int consonante=0;
        int vowels=0;
        String input1 =input.toLowerCase();
        for(int i=0;i<input.length();i++){
        if('a' ==input1.charAt(i)||input1.charAt(i)=='e'||input1.charAt(i)=='i'||input1.charAt(i)=='o'|| input1.charAt(i)=='u'){
             vowels++;
           
        }
        else{
            consonante++;
              System.out.println(input1.charAt(i));
        } 
        }

        return  "No. of consonants in string: "+consonante;

       }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter a String :");
        String input = sc.nextLine();
        System.out.println(consonants(input));
       }
    }

       
       
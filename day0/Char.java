 
  /*  Write a program in Java to accept a String from the user. Pass the
  String to a method which displays the first character of each word after
  changing the case (lower to upper and vice versa).*/
  
  
  import java.util.Scanner;
  class Char {
     static String convert(String input){

        String result="";
        String arr[] =   input.split(" ");
     
     for(int i=0;i<arr.length;i++){
        if(Character.isUpperCase(arr[i].charAt(0))){
         result+= Character.toLowerCase(arr[i].charAt(0))+" ";
        }
        else{
        result+= Character.toUpperCase(arr[i].charAt(0))+" ";
        }
     }
     return result;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter A String :");
       String input = sc.nextLine(); 
       System.out.println(convert(input));
    }
}

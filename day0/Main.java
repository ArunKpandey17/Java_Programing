 
  
  
  
  import java.util.Scanner;
  public class Main{
    static String convert(String input){

       String result="";
       String arr[] =  input.split(" ");
    
    for(int i=0;i<arr.length;i++){
       if(Character.isUpperCase(arr[i].charAt(0))){
        result+= Character.toLowerCase(arr[i].charAt(0));
        System.out.println(Character.toLowerCase(arr[i].charAt(0)));
       }
       else{
     //   result+= Character.toUpperCase(arr[i].charAt(0));
     System.out.println(Character.toUpperCase(arr[i].charAt(0)));
       }
    }
    return "sahgak";
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine(); 
     //  System.out.println(convert(input));
      convert(input);
   }
}

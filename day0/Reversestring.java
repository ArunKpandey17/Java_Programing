import java.util.Scanner;
 class ReverseString{
    static String reverse(String inputString) {
          String reversedString = "";
          for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString += inputString.charAt(i);

    }
    return reversedString;
}


    public static void main(String[]agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        String reveresedString = reverse(inputString);
        System.out.println("Reversed string:"+reveresedString);
    }
    
}
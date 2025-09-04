import java.util.Scanner;
 public class TextAnalyzer{
    
    public static String analyzeText(String input){
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

        return  " consonants : "+consonante+ "Vowels:" +vowels;

       }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        
        String input = sc.nextLine();
        System.out.println(analyzeText(input));
       }
    }

       
       
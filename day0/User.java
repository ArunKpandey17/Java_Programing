/*Design Friend Suggestion System Module.
Instagram suggests friends based on mutual connections and account
verification status. Verified users are prioritized for suggestions.

Task:
Create a class User with:
int mutualFriends
boolean isVerified
Write a method getSuggestionLevel() that returns:
- "Strong Suggestion" if mutualFriends ≥ 10 and the user is verified.
- "Moderate Suggestion" if mutualFriends is between 1 and 9.
- "Low Suggestion" if mutualFriends = 0 or the user is not verified*/



import java.util.Scanner;
 public class User{
    int mutualFriends;
    boolean isVerified;
    public static String getSuggestionLevel(int mutualFriends,boolean isVerified){
        if(isVerified){
            if(mutualFriends>=10) return "Strong Suggestion";
            else if(mutualFriends>=1 && mutualFriends<=9) return "Moderate Suggestion";
            else return "Low Suggestion";
        }else{
            return "Low Suggestion";
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        boolean b = sc.nextBoolean();
        System.out.println("Suggestion Level: "+getSuggestionLevel(i,b));
    }
}
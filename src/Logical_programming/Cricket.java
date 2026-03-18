package Logical_programming;
import java.util.Scanner;

class Batter {
    String Name;
    int Matches;
    int runs;
    float batting_avg;

    public Batter() {
    }

    Batter(String Name, int Matches, int runs) {
        this.Name = Name;
        this.Matches = Matches;
        this.runs = runs;
    }

    public void computeBattingAverage() {
        if (Matches <= 0 || runs < 0) {
            System.out.println("ERROR");
        }
        this.batting_avg = runs / Matches;
        System.out.println("Batting Avg: " + batting_avg);
    }

    public void display() {
        System.out.println("Batter Name :  " + Name);
        System.out.println("Matches of Batter: " + Matches);
        System.out.println("Batter Score Run :" + runs);

    }

}

public class Cricket{
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Batter Name: ");
   String Name = sc.nextLine();
   System.out.println("Enter Match played : ");
   int Matches = sc.nextInt();
   System.out.println("Enter Batter Runs: ");
   int runs = sc.nextInt();
    Batter b1 = new Batter(Name,Matches,runs);
    b1.computeBattingAverage();
}
}

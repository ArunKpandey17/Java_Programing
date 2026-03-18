package Logical_programming;

public class star_pattern {
	 public static int n=5;
public static void main(String []args) {
	
	for(int i=1;i<=n;i++) {
		for(int j=n;j>=1;j--) {
			System.out.print("* ");
		}
		System.out.println();
	}

}
}

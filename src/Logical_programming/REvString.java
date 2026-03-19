package Logical_programming;

public class REvString {

	public static void main(String []args) {
		String str="java is powerfull ";
		String arr[] = str.split(" ");
		
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j =arr[i].length()-1; j>=0;j--) {
				  System.out.print(arr[i].charAt(j));
				}
			 System.out.print(" ");
			}
							
	
		
//		for(int i =length-1;i>=0;i--) {
//			System.out.println(str.charAt(i));
//			
//		}
//		for(int j=length1-1;j>=0;j--) {
//			System.out.print(s.charAt(j));
//		}
				
	}
	
}

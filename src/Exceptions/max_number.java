package Exceptions;

public class max_number {
	int a;
	int b;
     static public void  maxNumber(int a, int b)throws NumberFormatException {
    	 if(a==b) {
    		 throw new  NumberFormatException();
    		
    	 }
    	 
     else if(a>b ) {
			System.out.println("a is max");
		}
		else System.out.println("b is max");
    	  
      }
     public static void main(String []args) {
    	 maxNumber(7,1);
     }
}

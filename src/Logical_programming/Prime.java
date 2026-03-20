package Logical_programming;
import java.util.Scanner;

class Prime 
{
	public static void main(String[] args) 
	{
		int num;
		boolean isprime = true;
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1 =S1.nextInt();
	
		if(num1<=1) 
		{
			System.out.println("Its not a prime number");
		}
		else 
		{ 
			for (int i=2;i<=Math.sqrt(num1);i++)
			{
			    if(num1%i==0) 
			    {
			    	isprime= false;
			    	break;
			    }
			}
		}
	    if (isprime== false) 
	    {
	    	System.out.println("its not a prime number");
	    }
	    else 
	    {
		   System.out.println("Its a prime");
       }
    }    
}


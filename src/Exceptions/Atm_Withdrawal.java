package Exceptions;


class AmmountNotHigherThenExistingAmmount extends Exception {
    public AmmountNotHigherThenExistingAmmount(String m) {
        super(m);  
    }
}

public class Atm_Withdrawal {
	double ammount;
	double  Withdrawalammount;
	
	
	static public void  withdrawalAmmoutn(double ammount,double Withdrawalammoun)throws AmmountNotHigherThenExistingAmmount {
		if(Withdrawalammoun>ammount) {
			throw new AmmountNotHigherThenExistingAmmount("Ammount  not higer then existing ammount"); 
		}
		else if(Withdrawalammoun<ammount) {
			System.out.println("Withdrawal copmleted");
			
		}
	}
	public static void main(String[]args) throws AmmountNotHigherThenExistingAmmount {
		 withdrawalAmmoutn(5000,1000);
	}

}

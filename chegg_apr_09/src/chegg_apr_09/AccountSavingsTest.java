package chegg_apr_09;

public class AccountSavingsTest {
	public static void main(String[] args) {
		// creating objects of AccountSavings 
		AccountSavings acc1 = new AccountSavings(2000.00);
		AccountSavings acc2 = new AccountSavings(3000.00);
		
		// Set annual interest Rate to 4%
		acc1.setAnnualIntrestRate(0.04);
		acc2.setAnnualIntrestRate(0.04);
		
		System.out.println("MONTHLY BALANCE FOR acc1 ");
		for (int i = 0; i <12; i++){
			acc1.calculateMonthlyInterest();
			System.out.println("Month " + (i+1) + ": " + 
			String.format ("$%.2f", acc1.getSavingsBalance()));
		}	
		
		System.out.println();
		
		System.out.println("Monthly balances for acc2");
		for (int i = 0; i <12; i++){
			acc2.calculateMonthlyInterest();
			System.out.println("Month " + (i+1) + ": " + 
			String.format ("$%.2f", acc2.getSavingsBalance()));
		}		
	}
}

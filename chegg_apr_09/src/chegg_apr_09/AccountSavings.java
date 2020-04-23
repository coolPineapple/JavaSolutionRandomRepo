package chegg_apr_09;

public class AccountSavings {
	private static double annualInterestRate;
	private static double savingsBalance;
	
	// start constructor
	public AccountSavings (double savingsBalance) {
		//validating savingsBalance
		if (savingsBalance < 0.0) {
			throw new IllegalArgumentException ("The balance "
					+ "of Account must be greater than 0");
		}
		this.savingsBalance = savingsBalance;
	}
	//end constructor
	
	
	public static double getAnnualIntrestRate() {
		return annualInterestRate;
	}


	public static void setAnnualIntrestRate(double annualIntrestRate) {
		AccountSavings.annualInterestRate = annualIntrestRate;
	}


	public static double getSavingsBalance() {
		return savingsBalance;
	}


	public static void setSavingsBalance(double savingsBalance) {
		AccountSavings.savingsBalance = savingsBalance;
	}


	// Method to calculate monthlyInterest
	public double calculateMonthlyInterest() {
		double interestAmount = (double) (savingsBalance * annualInterestRate / 12);
		return savingsBalance = savingsBalance + interestAmount;
	}
	
	// method to modify interest rate
	public static void modifyInterestRate (double updatedRate){
		if (updatedRate >= 0.0 || updatedRate <= 1.0) {
			annualInterestRate = updatedRate;
		}
		throw new IllegalArgumentException ("Annual Interest Rate must be between 0.0 and 1.0");
		
	}


	@Override
	public String toString() {
		
			String savingsBal =  String.format ("%.3f%n",getSavingsBalance());
			
		return savingsBal;
	}

	
	
	
	
}

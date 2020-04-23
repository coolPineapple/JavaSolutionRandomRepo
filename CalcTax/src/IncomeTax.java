
import java.util.Scanner;

public class IncomeTax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your total income: ");
		double totIncome = sc.nextDouble();
		if(totIncome < 0) {
			System.out.println("Your income cannot be negative.");
			System.out.println("What is your total income: ");
			totIncome = sc.nextDouble();
		}
		
		System.out.println("How many children do you have: ");
		int nChild = sc.nextInt();
		if(nChild < 0) {
			System.out.println("You must enter a positive number.");
			System.out.println("How many children do you have: ");
			nChild = sc.nextInt();
		}
		
		if(totIncome == 10000 && nC) {
			
		}
		
		
	}
	

}

package chegg_apr_13;


import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/* Taking input for card number of and validating
		 * if user enters card number not in range of 1 to 13 (both including)
		 * program prints message and program is Terminated */
		System.out.println("Enter three integers which between 1 and 13");
		int[] card_num = new int[3];
		int cNum;
		for(int i=0 ; i<3 ; i++) {
			cNum = sc.nextInt();
			
			if(cNum < 0 || cNum > 13) {
				System.out.println("Incorrect input. \nExiting program...");
				System.exit(0);
				
			}
			card_num[i] = cNum;
				
		}
		
		/* Taking input for card deck names */
		System.out.println("Enter the card deck names");
		String[] cardDeckNames = new String[3];
		for(int j=0 ; j<3 ;j++  ) {
			cardDeckNames[j] = sc.next();
		}
		
		sc.close(); /* Closing the Scanner resources */
		
		/* Loop which iterated through the array of card_num and cardDeckNames 
		 * and prints them in order of input */
		System.out.println("Output:");
		for( int i=0; i<3; i++) {
			String result = printValueOfCard(card_num[i])+" of "+cardDeckNames[i];
			System.out.println(result);
		}
		
	}
	
	
	/* Using Switch case to return the name of card deck */
	public static String printValueOfCard(int cardNumber) {
		
		switch (cardNumber) {
		case 1:
			return "ace";
			
		case 11:
			return "jack";
			
		case 12:
			return "queen";
			
		case 13:
			return "king";
			
		default:
			return String.valueOf(cardNumber);
		}
		
	}
	
	


}

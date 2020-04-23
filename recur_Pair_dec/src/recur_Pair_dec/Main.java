package recur_Pair_dec;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n =10;
		
		Main.printRec(10);
	}
	
	static void printRec(int num) {
		int n=1;
		if ( n >=num) {
			return;
			
		}
		n++;
		/*8
		 * p > 7
		 * p > 8
		 * 
		 * */
		
		printRec(num+2);
		System.out.println(num-1);
		System.out.println(num);
	}
}
	
//	public void printLines(Scanner scan) {
//}



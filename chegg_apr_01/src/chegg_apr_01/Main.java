package chegg_apr_01;



public class Main {
	public static void main(String[] args) {
		/* Creating First Rectangle object r1*/
		Rectangle r1 = new Rectangle(40, 10);
		/* Printing details of r3 using toString() method */
		System.out.println(r1.toString());
		
		/* Creating Second Rectangle object r2*/
		Rectangle r2 = new Rectangle(37, 37);
		/* Printing details of r3 using toString() method */
		System.out.println(r2.toString());
		
		System.out.println(r1.isTheSameSize(r2));
		
		/*  If they are not the same size, then determine if the 1stRectangle is
		 *  then determine if the 1stRectangle is larger or smaller than the 2ndRectangle.
		 */
		if(r1.isTheSameSize(r2) == false) {
			System.out.println(r1.isLargerThan(r2));
		}
		
		/* Checking whether the Rectangle object r1 is Square or not by using isSquare() method */ 
		System.out.println(r1.isSquare());
		
		/* Checking whether the Rectangle object r2 is Square or not by using isSquare() method */
		System.out.println(r2.isSquare());
		
		/* Creating third Rectangle object r3*/
		Rectangle r3 = new Rectangle(80, 5);
		/* Printing details of r3 using toString() method */
		System.out.println(r3.toString());
		/* Checking if the r3 is Square or not by using isSquare() method */
		System.out.println(r3.isSquare());
		
		/* Print whether the first and third Rectangle objects have the same area,
		 * and whether the they are equal.*/
		System.out.println(r1.isTheSameSize(r3));
		
		
		
	}
}

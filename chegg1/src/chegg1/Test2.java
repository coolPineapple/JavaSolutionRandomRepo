package chegg1;

// This class is designed to Test the Working of Class CollectableItem
// and inherited class Coin 

public class Test2 {

	public static void main(String[] args) {
		
		Coin c = new Coin(1, "Antique Coin", 1000, true, "$5", 1990, "Good");
		
		// getting condition of coin by calling getCondition()
		System.out.println(c.getCondition());
		
		// getting denomination of coin by calling getDenomination()
		System.out.println(c.getDenomination());
		
		// getting Year of manufacturing of Coin by calling getYear()
		System.out.println(c.getYear());
		
		// setting the onSale to false
		c.setOnSale(false);
		// Checking if coin is available for sale
		System.out.println(c.isOnSale());
		
		
		// Getting the type of Item by calling getItemType()
		System.out.println(c.getItemType());
		
		// calling toString Method
		System.out.println(c.toString());
		
		

	}

}

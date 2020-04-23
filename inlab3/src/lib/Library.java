package lib;

import java.util.ArrayList;
/*Add the Library class as given in the class diagram. 
 * The items ArrayList is static and has a getter, but no setter. 
 * The addItem() method is static and should receive a Publication 
 * parameter and adds it to the items
 *  list but only if the parameter is not null and 
 *  it is not already existing in the list.
 *  
 *  */

public class Library{
	
	public static ArrayList<Publication> items = new ArrayList<>();
	
	public Library() {
		super();
	}
	public static ArrayList<Publication> getItems() {
		return items;
	}
	public static void addItem(Publication publication) {
		if(publication != null && items.contains(publication) != true) {
			items.add(publication);
		}
	}
	
	
}
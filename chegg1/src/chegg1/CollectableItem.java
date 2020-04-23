package chegg1;

public class CollectableItem {
	int id;
	String itemType;
	double price;
	boolean onSale;
	
	// Constructor of CollectableItem Class 
	public CollectableItem(int id, String itemType, double price, boolean onSale) {
		super();
		this.id = id;
		this.itemType = itemType;
		this.price = price;
		this.onSale = onSale;
	}
	
	// getItemType( ) : String
	public String getItemType() {
		return itemType;
	}
	
	// getPrice( ) : double       
	public double getPrice() {
		return price;
	}
	// isOnSale( ) : boolean   
	public boolean isOnSale() {
		return onSale;
	}
	
	// setOnSale(onSale : boolean)  
	public void setOnSale(boolean onSale) {
		this.onSale = onSale;
	}
	
	// toString( ) : String 
		@Override
		public String toString() {
			return "CollectableItem [id=" + id + ", itemType=" + itemType + ", price=" + price + ", onSale=" + onSale + "]";
		}

}

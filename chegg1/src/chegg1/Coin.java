package chegg1;

 class Coin extends CollectableItem{
	 String denomination;
	 int year;
	 String condition;
	 
	 // Constructor of Coin Class
	public Coin(int id, String itemType, double price, boolean onSale, String denomination, int year,
			String condition) {
		super(id, itemType, price, onSale);
		
		this.denomination = denomination;
		this.year = year;
		this.condition = condition;
	
	}
	
	// getDenomination( ) : String     
	public String getDenomination() {
		return denomination;
	}
	
	//getYear( ) : int    
	public int getYear() {
		return year;
	}
	
	// getCondition( ) : String                                    |
	public String getCondition() {
		return condition;
	}
	
	// toString( ) : String   
	@Override
	public String toString() {
		return "Coin [denomination=" + denomination + ", year=" + year + ", condition=" + condition + "]";
	}
	

}

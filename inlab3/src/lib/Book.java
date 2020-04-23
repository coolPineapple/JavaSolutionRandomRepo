package lib;

import java.text.DecimalFormat;
/*
 * Add the Book subclass as given in the class diagram. 
 * Override getInfo() method so that it returns a string representing pubNo, 
 * title, SubClassName and price in the following form 
 * (notice that price is displayed with 2 decimal places):
     12346,Strength of Materials,Book,245.50*/
public class Book extends Publication{
	private double price;
	/**
	 * @param pubNo
	 * @param title
	 * @param price
	 */
	public Book(int pubNo, String title, double price) {
		super(pubNo, title);
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String getInfo() {
		// Using DecimalFormat to get two values after decimal.
		DecimalFormat df = new DecimalFormat("#.##"); 
		return super.getInfo()+","+df.format(getPrice());
	}
	
	
}
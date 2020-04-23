package chegg_apr_01;


/*In this Program, The Rectangle is the class
 * length and width are instance variable of type Double
 * Class java.text.DecimalFormat is imported to format the output of double values upto two decimal places*/
import java.text.DecimalFormat;

public class Rectangle {
	private double length;
	private double width;
	/**
	 * @param length
	 * @param breadth
	 */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		orderLengthAndWidth();
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
		orderLengthAndWidth();
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
		orderLengthAndWidth();
	}
	/* Return true if the current rectangle object is Square */
	boolean isSquare() {
		if(length == width) {
			return true;
		}
		return false;
	}
	
	private double computeArea() {
		return length*width;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("##.##");
		return "The rectangle’s length is "+ df.format(length) +", width is "+
				df.format(width) +", and area is "+ df.format(computeArea());
		
	}
	/** this method checks whether the  two rectangles are equal based on their length and width */
	public boolean equals(Rectangle r) {
		if(this.getLength() == r.getLength() && this.getWidth() == r.getWidth() ) {
			return true;
		}
		else {
			return false;
		}
	}
	/*This method return false if passes rectangle object area is larger */
	public boolean isLargerThan(Rectangle r){
		if(this.computeArea() > r.computeArea()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/* This method checks if both the rectangle are of same size or not */
	public boolean isTheSameSize(Rectangle r) {
		if(this.computeArea() == r.computeArea()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	/* This orderLengthAndWidth() method will ensure that the Length of the rectange is always Greater than the width
	 * If the width is greater than the length then the program will be terminated automatically 
	 * * */
	private void orderLengthAndWidth() {
		if(this.length < this.width) {
			System.exit(0);
		}
		
		
	}
	

}

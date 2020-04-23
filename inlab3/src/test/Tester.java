package test;
import lib.*;

import java.text.DecimalFormat;


public class Tester {
	public static void main(String[] args) {
		Library.addItem( new Book(1234, "Java: How To Program", 325.0) );

	       Library.addItem( new Paper(321, "Crack Propagation in RC", "The Civil Engineer") );

	       Library.addItem( new Paper(376, "A New Runge-Kutta Method", "ACM Transactions") );

	       Library.addItem( new Book(1574, "Fundamentals of Database Systems", 299.95) );

	       Library.addItem( new Book(1288, "Network Essentials", 278.0) );

	       Library.addItem( new Paper(529, "A Robot for Pipeline Inspection", "IEEE") );

	       Library.addItem( new Paper(533, "Cybersecurity Education", "IEEE") );

	       Library.addItem( new Book(1290, "Python Tutorial", 269.5) );	
	
	       int countBooks=0;
	       double totalPrice =0;
	       double avgPrice=0;

	       // // Using DecimalFormat to get two values after decimal.
	       DecimalFormat df = new DecimalFormat("#.##"); 
	      
	       
	       for(Publication publication : Library.getItems()) {
	    	   if(publication instanceof Book) {
	    		   countBooks++;
	    		   totalPrice=totalPrice +  ((Book)publication).getPrice();
	    		   
	    	   }
	    	   System.out.println(publication.getInfo());
	    	}
	       
	       
	      System.out.println("\nNumber of Books: "+ countBooks);
	      avgPrice = totalPrice/countBooks;
	      System.out.println("Average Price per Book: "+ df.format(avgPrice));
	      
	      
	      System.out.println("\nItems below average price:");
	      for(Publication publication : Library.getItems()) {
	    	   if(publication instanceof Book && ((Book)publication).getPrice() < avgPrice) {
	    		   System.out.println(((Book)publication).getTitle()+ "," +((Book)publication).getPrice());
	    		   
	    	   }
	    	   
	       }
	      
	
	}

}

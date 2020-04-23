package chegg4;

import java.util.LinkedList;
import java.util.List;

public class Main{
public static void main( String[] args ){
// Create some pet objects
Snake longestPython = new Snake( "reticulated python",123456.78, 80.0, 48.6667 );
Turtle smallestTurtle = new Turtle( "speckled cape tortoise", 98.76, 88.0, 2.1 );
Bird macaw = new Bird( "hyacinth macaw", 249.99, 48.0 );
Bird polly = new Bird( "amazon parrot", 321.09, 15.545);

// create a pet store
PetStore happyPetsInc = new PetStore();

// add the pets to the pet store
happyPetsInc.addPet( longestPython );
happyPetsInc.addPet( smallestTurtle );
happyPetsInc.addPet( macaw );
happyPetsInc.addPet( polly );

// display information about the pet store
System.out.println("Happy Pets, Inc. currently has " + happyPetsInc.getInventoryCount() + " pets");
System.out.println( happyPetsInc.toString() );

// remove some pets
happyPetsInc.sellPet( macaw );
happyPetsInc.sellPet( longestPython );
  
// display (updated) information about the pet store
System.out.println( happyPetsInc.toString() );


}
}

class PetStore{
	
	static List<Pet> pets = new LinkedList<>();
	
	 void addPet(Pet pet) {
		pets.add(pet);
	}
	
	 boolean sellPet(Pet pet) {
		return pets.remove(pet);
		
		
	}
	
	 int getInventoryCount() {
		return pets.size();
	}

	@Override
public String toString() {
		String className="";
		String res1="";
		for(int i=0;i<pets.size(); i++) {
			className = pets.get(i).getClass().getSimpleName();
			if (className == "Bird") {
			String res = "Pet Store Inventory ("+ String.valueOf(getInventoryCount())+""
					+ "):\n"+"Pet #"+String.valueOf(i)+"Species: "+pets.get(i).species+
					"Cost: $ "+pets.get(i).cost+" "+className+" (Needs an air temperature of "+((Bird) pets.get(i)).getWingspan()+" inches)"
					+" "+((Snake) pets.get(i)).getLength()+"";
			return res;
			}
			
				
					res1 = "Pet Store Inventory ("+ String.valueOf(getInventoryCount())+""
							+ "):\n"+"Pet #"+String.valueOf(i)+"Species: "+pets.get(i).species+
							"Cost: $ "+pets.get(i).cost+" "+className+" (Wingspan: "+((Bird) pets.get(i)).getWingspan()+" F)"
							;
					
				
			
			
			
		}
		return res1;
	}
	 
	
	
}
/*
 * Pet class: This is a base class for all pe
It needs to provide at least the following methods: Constructor that takes
 a String (for the species) and a double (for the cost [in dollars]) as parameters setSpecies() that
  takes a String as a parameter getSpecies() that returns a String setCost() that takes a double as a parameter getCost() that returns a double
 * 
 * */
class Pet{
	String species;
	double cost;
	public Pet(String species, double cost) {
		super();
		this.species = species;
		this.cost = cost;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
}

/*Bird class: This is a concrete class for storing information about a bird (that is a pet).
 *  It needs to provide at least the following methods: Constructor that takes a String (for the species),
 *   a double (for the cost [in dollars]), and a double (for the wingspan [in inches]) as
 *    parameters setWingspan() that takes a
 *  double as a parameter getWingspan() that returns a double toString() that returns a
 *   String in the following format: Species: Cost: $ Bird (Wingspan: inches)
 * 
 * */
class Bird extends Pet{
	String species;
	double cost;
	double wingspan;
	public Bird(String species, double cost, double wingspan) {
		super(species, cost);
		this.cost = cost;
		this.wingspan = wingspan;
	}
	public double getWingspan() {
		return wingspan;
	}
	public void setWingspan(double wingspan) {
		this.wingspan = wingspan;
	}
	@Override
	public String toString() {
		return "Bird [species: " + species + ", cost: $ " + cost + ", wingspan: " + wingspan + "]";
		
	}	
}
/*Reptile class: This is another abstract class. It stores information about a reptile (that is a pet). 
 * Reptiles are cold blooded, so, we need to keep track of their required air temperature. 
 * This class needs to provide at least the following methods: Constructor that takes a String (for the species), 
 * a double (for the cost [in dollars]), and a double (for the air temperature
 *  [in degree Fahrenheit]) as parameters setAirTemperature() that takes a double as a 
 *  parameter getAirTemperature() that returns a double
 * */
class Reptile extends Pet{
	String species;
	double cost;
	double airTemp;
	public Reptile(String species, double cost, double cost2, double airTemp) {
		super(species, cost);
		cost = cost2;
		this.airTemp = airTemp;
	}
	public double getAirTemp() {
		return airTemp;
	}
	public void setAirTemp(double airTemp) {
		this.airTemp = airTemp;
	}	
}

/*Snake class: This is another concrete class for storing information about a snake (which is a reptile). 
 * It needs to provide at least the following methods: Constructor that takes a String (for the species), 
 * a double (for the cost [in dollars]), a double (for the air temperature [in degree Fahrenheit]), and a 
 * double (for the length [in inches]) as parameters setLength() that takes a double as a parameter getLength() 
 * that returns a double toString() 
 * that returns a String in the following format: Species: Cost: $ Reptile (Needs an air temperature of F) 
 * Snake ( inches long)*/

class Snake extends Reptile{
	String species;
	double cost;
	double airTemp;
	double length;
	
	/**
	 * @param species
	 * @param cost
	 * @param cost2
	 * @param airTemp
	 * @param length 
	 */
	public Snake(String species, double cost, double airTemp, double length) {
		super(species, cost, airTemp, length);
		this.species = species;
		this.cost = cost;
		this.airTemp = airTemp;
		this.length = length;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	@Override
	public String toString() {
		return "Snake [species: " + species + ", cost: $ " + cost + ", airTemp: " + airTemp + ", length: " + length + "]";
	}

}

/*Turtle class: This is another concrete class for storing information about a 
 * turtle (which is a reptile). It needs to provide at least the following methods: 
 * Constructor that takes a String (for the species), a double (for the cost [in dollars]) as parameters,
 *  a double (for the air temperature [in degree Fahrenheit]), and a double (for the shell's diameter [in inches]) 
 *  setShellDiameter() that takes a double as a parameter, which is the diameter of the turtle's shell (in inches) 
 *  getShellDiameter() that returns a double toString() that returns a String in the following 
 *  format: Species: Cost: $ Reptile (Needs an air temperature of F) 
 * Turtle (Shell diameter: inches) Finally, include a completed rubric as a comment in
 * 
 * 
 * */

class Turtle extends Pet{
	String species;
	double cost;
	double airTemp;
	double shellDiam;
	
	public Turtle(String species, double cost, double airTemp, double shellDiam) {
		super(species, cost);
		this.airTemp = airTemp;
		this.shellDiam = shellDiam;
	}
	
	public double getShellDiam() {
		return shellDiam;
	}
	public void setShellDiam(double shellDiam) {
		this.shellDiam = shellDiam;
	}
	@Override
	public String toString() {
		return "Turtle [species: " + species + ", cost: $ " + cost + ", airTemp: " + airTemp + ", shellDiam: " + shellDiam
				+ "]";
	}
	
	
}















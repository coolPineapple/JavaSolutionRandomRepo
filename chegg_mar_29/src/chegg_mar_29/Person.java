package chegg_mar_29;

public class Person {
	String name;
	int age;
	Address personAddress;
	static int NumOfPersons;
	/**
	 * @param name
	 * @param age
	 * @param personAddress
	 */
	public Person(String name, int age, Address personAddress) {
		super();
		this.name = name;
		this.age = age;
		this.personAddress = personAddress;
		// incrementing number of Person 
		NumOfPersons++;
	}
	
	public Person() {
		super();
	}
	
	// Function to set the value of above instance variables
	public void setAll(String name, int age, Address personAddress) {
		this.name = name;
		this.age = age;
		this.personAddress = personAddress;
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getPersonAddress() {
		return personAddress;
	}
	
	static int getNumberOfPersons() {
		return NumOfPersons;
	}

	// implementation of displayPerson() method
	public String displayPerson() {
		return "Person: "+name + "," + age + "," + personAddress.toString();
	}
	
	

}

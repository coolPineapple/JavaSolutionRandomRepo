package chegg_mar_29;

public class Main {
	public static void main(String[] args) {
		// Creating objects of Address type
		Address ad1 = new Address(1,"Downtown","Abu Dhabi","UAE");
		Address ad2 = new Address(2,"Jimi","Al Ain","UAE");
		Address ad3 = new Address(3,"Deria","Dubai","UAE");
		
		// Creating objects of Person type
		Person per1 = new Person("Ahmed",21,ad1);
		Person per2 = new Person("Salem",23,ad2);
		

		
		// Changing per1 details to: Ahmed,25,ad3
		per1.setAll("Ahmed", 25, ad3);
		
		
		// Printing the details of per1 object
		System.out.println(per1.displayPerson());
		// Printing the details of per2 object
		System.out.println(per2.displayPerson());
		
		
		// printing the number of person created using getNumberOfPersons() method 
		System.out.println(Person.getNumberOfPersons());
		
		
	}

}

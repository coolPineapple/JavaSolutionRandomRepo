package chegg_mar_30;

public class RegisteredPerson extends Person {
	private String govID;

	/**
	 * @param firstName
	 * @param lastName
	 * @param govID
	 */
	public RegisteredPerson(String firstName, String lastName,OCCCDate dob, String govID) {
		super(firstName, lastName,dob);
		this.govID = govID;
	}

	/**
	 * @param p
	 * @param govID
	 */
	public RegisteredPerson(Person p, String govID) {
		super(p);
		this.govID = govID;
	}

	public String getGovID() {
		return govID;
	}
	
	

	boolean equals(RegisteredPerson person) {
		if(person == this) {
			return true;
		}
		return false;
		
	}

	boolean equals(Person person) {
		if(person.getFirstName().equalsIgnoreCase(this.firstName) && person.getLastName().equalsIgnoreCase(this.lastName)
				&& person.getDob().equals(this.dob)) {
			return true;
			
		}
		return false;
		
	}
	
	@Override
	public String toString() {
		return "RegisteredPerson [govID=" + govID + "]";
	}
	


	
}

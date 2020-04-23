package chegg_mar_30;

public class OCCCPerson extends Person {
	
	protected String StudentID;

	/**
	 * @param p
	 * @param studentID
	 */
	public OCCCPerson(Person p, String studentID) {
		super(p);
		StudentID = studentID;
	}

	/**
	 * @param p
	 */
	public OCCCPerson(OCCCPerson p) {
		super(p);
		
	}
	
	public boolean equals(OCCCPerson person) {
		if(person == this) {
			return true;
		}
		return false;
		
	}
	
	public boolean equals(RegisteredPerson p) {
		if(p.getFirstName().equalsIgnoreCase(this.firstName) && p.getLastName().equalsIgnoreCase(this.lastName)
				&& p.getDob().equals(this.dob)) {
			return true;
		}
		return false;

	}
	
	public boolean equals(Person p) {
		if(p.getFirstName().equalsIgnoreCase(this.firstName) && p.getLastName().equalsIgnoreCase(this.lastName)
				&& p.getDob().equals(this.dob)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "OCCCPerson [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", StudentID="
				+ StudentID + "]";
	}

	
}
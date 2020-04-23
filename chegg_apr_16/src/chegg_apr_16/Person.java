package chegg_apr_16;

public class Person {
	private String myFirstName;
	private String myLastName;
	private String myEmailAddress;
	/**
	 * @param myForstName
	 * @param myLastName
	 * @param myEmailAddress
	 */
	public Person(String myFirstName, String myLastName) {
		super();
		this.myFirstName = myFirstName;
		this.myLastName = myLastName;
		if(myLastName.length() >= 5) {
		myEmailAddress = myFirstName.charAt(0)+""+myLastName.substring(0,5)+"@yahoo.com";
		}
		if(myLastName.length() < 5) {
			myEmailAddress = myFirstName.charAt(0)+""+myLastName+"@yahoo.com";
		}
		
	}
	
	/*  Getter and setterMethods of Person */
	public String getMyFirstName() {
		return myFirstName;
	}
	public void setMyFirstName(String myFirstName) {
		this.myFirstName = myFirstName;
	}
	public String getMyLastName() {
		return myLastName;
	}
	public void setMyLastName(String myLastName) {
		this.myLastName = myLastName;
	}
	public String getMyEmailAddress() {
		return myEmailAddress;
	}
	public void setMyEmailAddress(String myEmailAddress) {
		this.myEmailAddress = myEmailAddress;
	}
	
	/* Overriding toString() to provide custom implementation */
	@Override
	public String toString() {
		return "First Name: "+getMyFirstName()+" Last Name: "+getMyLastName()+" has EmailAddress: "+getMyEmailAddress();
	}
	
	
	
	
	
	
}

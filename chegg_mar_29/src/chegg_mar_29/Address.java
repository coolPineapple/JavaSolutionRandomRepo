package chegg_mar_29;

public class Address {
	int buildNum;
	String street;
	String city;
	String country;
	/**
	 * @param buildNum
	 * @param street
	 * @param city
	 * @param country
	 */
	public Address(int buildNum, String street, String city, String country) {
		super();
		this.buildNum = buildNum;
		this.street = street;
		this.city = city;
		this.country = country;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*
	 * overriding toString() 
	 */
	@Override
	public String toString() {
		return "Address: " + buildNum + "-" + street + "-" + city + "-" + country;
	}
	
	
	
	

}

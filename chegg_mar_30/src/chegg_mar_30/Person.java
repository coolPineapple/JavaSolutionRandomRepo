package chegg_mar_30;


import java.time.LocalDate;
import java.time.Period;

public class Person {
	protected String firstName;
	protected String lastName;
	protected OCCCDate dob;
	/**
	 * @param firstName
	 * @param lastName
	 */
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param dob
	 */
	public Person(String firstName, String lastName, OCCCDate dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}
	// Copy constructor
	public Person(Person p ) {
		firstName = p.firstName;
		lastName = p.lastName;
		dob = p.dob;
	}
	public OCCCDate getDob() {
		return dob;
	}
	/*In this method as return type given in question is INT so while calculating age 
	 * we need not truncate the output result because after truncating the result only 
	 * integer part will be left, Therefore to calculate age only years are returned as output. 
	 * */
	public int getAge() {
		/* LocalDate is immutable class in java which provide date related information
		*  irrespective of timezone info.
		*/
		LocalDate dobDate = LocalDate.of(dob.getYear(), dob.getMonthOfYear(), dob.getDayOfMonth()); /* specify year, month, date directly */
		
		LocalDate currentDate= LocalDate.now(); //  Fetched system date 
		Period diffBWdates= Period.between(dobDate, currentDate); /* between() method from period class is used to return period between two dates */
		int years = diffBWdates.getYears();
		return years;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return lastName+","+firstName+" ("+dob.toString()+")";
	}
	// Implementation of equals method to compare only firstname and lastname of Person Ignoring the case of Alphabets. 
	boolean equals(Person person) {
		if(person.getFirstName().equalsIgnoreCase(this.firstName) && person.getLastName().equalsIgnoreCase(this.lastName)
				&& person.getDob().equals(this.dob)) {
			return true;
			
		}
		return false;
	}
	
	public void eat() {
		System.out.println("Person is eating…");
	}
	public void sleep() {
		System.out.println("Person is sleeping…");
	}
	public void play() {
		System.out.println("Person is playing…");
	}
	public void run() {
		System.out.println("Person is running…");
	}
	
	
	
	
}

class OCCCDate{
	
	private int dayOfMonth;
	private int monthOfYear;
	private int year;
	/**
	 * @param dayOfMonth
	 * @param monthOfYear
	 * @param year
	 */
	public OCCCDate(int dayOfMonth, int monthOfYear, int year) {
		super();
		this.dayOfMonth = dayOfMonth;
		this.monthOfYear = monthOfYear;
		this.year = year;
	}
	public int getDayOfMonth() {
		return dayOfMonth;
	}
	public int getMonthOfYear() {
		return monthOfYear;
	}
	public int getYear() {
		return year;
	}
	@Override
	public String toString() {
		return monthOfYear+"/"+dayOfMonth+"/"+year;
	} 
	
}

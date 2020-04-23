package chegg_apr_16;

public class Student extends Person implements Comparable<Student> {
	
	String myEmailAddress;
	private int myStudentID;
	double myGPA;
	static int lastIDAssigned = 1000;
	/**
	 * @param myFirstName
	 * @param myLastName
	 * @param myGPA
	 * @param myStudentID
	 */
	public Student(String myFirstName, String myLastName) {
		super(myFirstName, myLastName);
		myFirstName = super.getMyFirstName();
		myLastName = super.getMyLastName();
		myEmailAddress = super.getMyEmailAddress();
		myGPA = 0;
		lastIDAssigned++;
		myStudentID = lastIDAssigned;
	}
	
	/*  Getter and setterMethods of Student */
	public String getMyFirstName() {
		return super.getMyFirstName();
	}
	public void setMyFirstName(String myFirstName) {
		super.setMyFirstName(myFirstName);
	}
	public String getMyLastName() {
		return super.getMyLastName();
	}
	public void setMyLastName(String myLastName) {
		super.setMyLastName(myLastName);
	}
	public String getMyEmailAddress() {
		return super.getMyEmailAddress();
	}
	public void setMyEmailAddress(String myEmailAddress) {
		this.myEmailAddress = myEmailAddress;
	}
	public int getMyStudentID() {
		return myStudentID;
	}
	public void setMyStudentID(int myStudentID) {
		this.myStudentID = myStudentID;
	}
	public double getMyGPA() {
		return myGPA;
	}
	public void setMyGPA(double myGPA) {
		this.myGPA = myGPA;
	}
	
	public String superClassToString() {
		return super.toString();
	}
	
	/* Overriding toString() to provide custom implementation */
	@Override
	public String toString() {
		return super.toString()+" has StudentID: "+getMyStudentID()+" has GPA: "+getMyGPA();
	}
	

	/* Implementing ComapreTo method to Provide comparision betwee students on the basis of their GPA */
	@Override
	public int compareTo(Student student) {
		if(this.getMyGPA() > student.getMyGPA()) {
			System.out.println(this.getMyFirstName()+" "+this.getMyLastName()+" has greater GPA than "+student.getMyFirstName()+" "+student.getMyLastName());
			return 1;
		}
		if(this.getMyGPA() < student.getMyGPA()) {
			System.out.println(this.getMyFirstName()+" "+this.getMyLastName()+" has less GPA than "+student.getMyFirstName()+" "+student.getMyLastName());
			return -1;
		}
		
			System.out.println(this.getMyFirstName()+" "+this.getMyLastName()+" has equal GPA to "+student.getMyFirstName()+" "+student.getMyLastName());
			return 0;
		
		
	}
	
	
	
	
	
	
	
}

package chegg_apr_5;


public final class Student {
	private int schoolID;
	private String name;

	public Student(String namePassed, int schoolIDPassed) {
		schoolID = schoolIDPassed;
		name = namePassed;
	}

	public int getSchoolID() {
		return schoolID;
	}

	public void setSchoolID(int schoolIDPassed) {
		schoolID = schoolIDPassed;
	}

	public String getName() {
		return name;
	}

	public void setName(String namePassed) {
		name = namePassed;
	}

	public boolean equals(Object toCompare) {
		if (toCompare instanceof Student) {
			Student temp = (Student) toCompare;
			return (temp.getSchoolID() == schoolID);
		}
		return false;
	}

	public String toString() {
		String toReturn = "name: " + name + " id: " + schoolID;
		return (toReturn);
	}
}
// End of Student.java
//Code for StackInterface.java
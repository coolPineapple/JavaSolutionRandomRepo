package chegg_apr_06;

/* Student class contains Structure of student along with all the fields as well as 
 * methods to calculate grade, computer average and other helper methods.
 * 
 * */

public class Student {
	private String sFirstName;
	private String sLastName;
	private int nQuiz1;
	private int nQuiz2;
	private int nQuiz3;
	private int nStudentId;
	private int nNextStudentId;
	private int QUIZZES;
	/**
	 * 
	 */
	public Student() {
		super();
		nStudentId = 0;
		
		
		
	}
	/**
	 * @param sFirstName
	 * @param sLastName
	 * @param nQuiz1
	 * @param nQuiz2
	 * @param nQuiz3
	 * @param nNextStudentId
	 */
	public Student(String sStudentFirstName, String sStudentLastName, int nInitQuiz1, int nInitQuiz2, int nInitQuiz3) {
		super();
		sStudentFirstName = sFirstName;
		sStudentLastName = sLastName;
		nInitQuiz1 = nQuiz1;
		nInitQuiz2 = nQuiz2;
		nInitQuiz3 = nQuiz3;
		nNextStudentId = nStudentId + 1;
		
		
	}
	public String getsFirstName() {
		return sFirstName;
	}
	public void setsFirstName(String sFirstName) {
		this.sFirstName = sFirstName;
	}
	public String getsLastName() {
		return sLastName;
	}
	public void setsLastName(String sLastName) {
		this.sLastName = sLastName;
	}
	public int getnQuiz1() {
		return nQuiz1;
	}
	public void setnQuiz1(int nQuiz1) {
		this.nQuiz1 = nQuiz1;
	}
	public int getnQuiz2() {
		return nQuiz2;
	}
	public void setnQuiz2(int nQuiz2) {
		this.nQuiz2 = nQuiz2;
	}
	public int getnQuiz3() {
		return nQuiz3;
	}
	public void setnQuiz3(int nQuiz3) {
		this.nQuiz3 = nQuiz3;
	}
	public int getStudentId() {
		return nStudentId;
	}
	public int getnNextStudentId() {
		return nNextStudentId;
	}
	public void setnNextStudentId(int nNextStudentId) {
		this.nNextStudentId = nNextStudentId;
	}
	
	public double calculateQuizAverage() {
		return (getnQuiz1()+getnQuiz2()+getnQuiz3())/3;
	}
	
	public String ComputeStudentGrade() {
		if(calculateQuizAverage() > 90) {
			return "A";
		}
		else if(calculateQuizAverage() <= 90 && calculateQuizAverage() > 80) {
			return "B";
		}
		else if(calculateQuizAverage() <= 80 && calculateQuizAverage() > 70) {
			return "C";
		}
		else if(calculateQuizAverage() <= 70 && calculateQuizAverage() > 60) {
			return "D";
		}
		return "E";
	}
	
	public String StudentFullName() {
		return getsFirstName()+" "+getsLastName();
	}
	
	public void printStudentInfo() {
		System.out.println("Student [ sFirstName=" + sFirstName + ", sLastName=" + sLastName + ", nQuiz1=" + nQuiz1 + ", nQuiz2="
				+ nQuiz2 + ", nQuiz3=" + nQuiz3 + ", nStudentId=" + nStudentId + ", nNextStudentId=" + nNextStudentId
				+ " ]");
		
	}
	
	
	
	
	
}

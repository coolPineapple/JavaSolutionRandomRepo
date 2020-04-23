package chegg_apr_06;

/* Main class is driver class for Student class, it contains Student processinf menu 
 * that will help the user to create student objects and help in performing other related operations 
 * on students */

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("STUDENT PROCESSING MENU");
		System.out.println("1. Create new student - empty Student");
		System.out.println("2. Create new Student - information available");
		System.out.println("3. Set Student First Name");
		System.out.println("4. Set Student Last Name");
		System.out.println("5. Enter Quiz1 Score");
		System.out.println("6. Enter Quiz2 Score");
		System.out.println("7. Enter Quiz3 Score");
		System.out.println("8. Get Quiz Average");
		System.out.println("9. Get StudentId");
		System.out.println("10. Get Next Available Id");
		System.out.println("11. Get Student Grade");
		System.out.println("12. Print Student Information");
		System.out.println("13. Exit");
		
		
		int option = sc.nextInt();
		Student student = new Student();
		switch(option) {
		  case 1:
		    student = new Student();
		    break;
		  case 2:
		    student = new Student();
		    break;
		  case 3:
			  String Fname = sc.next();
			    student.setsFirstName(Fname);
			    break;
		  case 4:
			  String Lname = sc.next(); 
			  student.setsLastName(Lname);
			    break;
		  case 5:
			  student.setnQuiz1(sc.nextInt());
			    break;
		  case 6:
			   student.setnQuiz2(sc.nextInt());
			    break;
		  case 7:
			    student.setnQuiz3(sc.nextInt());
			    break;
		  case 8:
			    student.calculateQuizAverage();
			    break;
		  case 9:
			    student.getStudentId();
			    break;
		  case 10:
			    student.getnNextStudentId();
			    break;
		  case 11:
			    student.ComputeStudentGrade();
			    break;
		  case 12:
			    student.printStudentInfo();
			    break;
		  default:
		    System.exit(0);
		}
		
		sc.close();
	}
}

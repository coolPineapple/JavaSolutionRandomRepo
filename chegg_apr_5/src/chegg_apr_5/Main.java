package chegg_apr_5;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student("jim", 700);
		Student s2 = new Student("sandy", 800);
		Student s3 = new Student("nancy", 900);
		
		
		//LinkedList<Student> students = new LinkedList<Student>();
		// Testinf stack implementaion of LinkedList
		
		Stack<Student> stackStud = new Stack<Student>(
				);
		stackStud.push(s1);
		stackStud.push(s2);
		stackStud.push(s3);
		
		
		stackStud.
		// This last inserted ement will be remove
		// or The top of stack will be removed
		System.out.println(stackStud.pop());
		System.out.println(stackStud.peek());
		System.out.println(stackStud.isEmpty());
		
	}

	
}


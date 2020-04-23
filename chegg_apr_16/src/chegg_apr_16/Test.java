package chegg_apr_16;

public class Test {
	
	public static void main(String[] args) {
		
		/* creating Person Objects */
		Person p1 = new Person("Tom", "Pal");
		Person p2 = new Person("Peter", "Parker");
		
		/* Creating Student object and setting their GPA value respectively */
		Student s1 = new Student("Scarlett", "Johansson");
		s1.setMyGPA(3.2);
		Student s2 = new Student("Will", "Smith");
		s2.setMyGPA(3.0);
		
		/* Printing All Person's Info */
		System.out.println("List of All People");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		System.out.println(s1.superClassToString());
		System.out.println(s2.superClassToString());
		
		/* Printing only Students Info*/
		System.out.println("\n\nList of All Students");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		System.out.println("\n\nComparison Of Students");
		s1.compareTo(s2);
		
		
	}
}

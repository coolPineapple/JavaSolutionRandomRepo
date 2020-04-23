package chegg_mar_30;

public class TestPerson {
	public static void main(String[] args) {
		OCCCDate dob1= new OCCCDate(10, 05, 1995);
		OCCCDate dob2= new OCCCDate(20, 06, 1996);
		
		Person p1 = new Person("Gordon","Freeman",dob1);
		Person p2 = new Person("john","Carter",dob2);
		Person p3 = new Person("Gordon","Freeman",dob1);
		
		// Get dob of person p1
		System.out.println(p1.getDob());
		
		// calculating age of p1
		System.out.println(p1.getAge());
		// returning toString
		System.out.println(p1.toString());
		
		// Checking id p1 is equal to p2 and p1 is equals p3
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
		
	}
}

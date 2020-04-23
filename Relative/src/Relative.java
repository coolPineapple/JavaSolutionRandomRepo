
	
public class Relative{
	
		String relativeName;
		String relationshipWithPerson;
		int month;
		int date;
		
	public Relative(String relativeName, String relationshipWithPerson, int month, int date) 
	{
		this.relativeName = relativeName;
		this.relationshipWithPerson = relationshipWithPerson;
		this.month = month;
		this.date = date;
	}

}

class RelativesApp{
	static void main() {
		Relative[] relative = new Relative[12];
		
		Relative aunt = new Relative("Mary", "Aunt", 12, 1);
		Relative brother = new Relative("Mike", "brother", 11, 1);
		Relative sister = new Relative("Helen", "sister", 10, 1);
		Relative cousin = new Relative("Carry", "cousin", 12, 23);
		Relative father = new Relative("Jim", "father", 9, 31);
		Relative friend = new Relative("Tom", "friend", 8, 20);
		Relative girlfriend = new Relative("Jasmine", "girlfriend", 7, 1);
		Relative godchild = new Relative("Modi", "godchild", 12, 1);
		Relative bride = new Relative("Joey", "bride", 11, 7);
		Relative son = new Relative("Chandler", "son", 10, 21);
		Relative daughter = new Relative("Phoeby", "daughter", 1, 12);
		Relative fatherInLaw = new Relative("Nick", "fatherInLaw", 2, 1);
		
		// Filling relative array with the relatives data
		
		relative[0] = aunt;
		relative[1] = brother;
		relative[2] = sister;
		relative[3] = cousin;
		relative[4] = father;
		relative[5] = friend;
		relative[6] = girlfriend;
		relative[7] = godchild;
		relative[8] = bride;
		relative[9] = son;
		relative[10] = daughter;
		relative[11] = fatherInLaw;
		
		// Displaying the contents of relative array with FOR LOOP
		
		for (int i = 0;i < relative.length; i++) {
			Console.WriteLine("Realtive name: "+relative[i].relativeName+" Realtionship: "+relative[i].relationshipWithPerson+" Birth date and month: "+relative[i].date+",  "+relative[i].month);
			
		}
		
		
	}
	
	
	
}

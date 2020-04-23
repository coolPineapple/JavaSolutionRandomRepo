package chegg3;

import java.util.LinkedList;
import java.util.List;

public class Main {

}

class Person{
	int id;
	String name;
	static List<Meeting> myMeeting;
	static List<Meeting> isOrganize;
	
	public Person(String name) {
		super();
		this.name = name;
	}
	static void addMeeting(Meeting meeting) {
		myMeeting = new LinkedList<>();
		myMeeting.add(meeting);
		
	}
	
	
}

class Meeting{
	
}

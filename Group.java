package calendarclasses;

import java.util.ArrayList;

public class Group {
	
	private ArrayList<Person> members;

	public ArrayList<Person> getMembers() {
		return members;
	}

	public void addMembers(Person person) {
		this.members.add(person);
	}
	
	public void removeMembers(Person person){
		this.members.remove(person);
	}
	
	
	

}

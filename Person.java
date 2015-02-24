package calendarclasses;

import java.util.ArrayList;

public class Person {
	
	private String firstName;
	private String lastName;
	private ArrayList<Calendar> calendarList;
	
	private String username;
	private String password;
	private String email;
	
	
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public ArrayList<Calendar> getCalendarList() {
		return calendarList;
	}
	public void setCalendarList(ArrayList<Calendar> calendarList) {
		this.calendarList = calendarList;
	}
	
	

}

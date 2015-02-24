package calendarclasses;

import java.time.LocalTime;
import java.util.ArrayList;

public class Appointment {
	
	private LocalTime startTime;
	private LocalTime endTime;
	private int duration; //in minutes
	
	private ArrayList<Person> hosts;
	private ArrayList<Person> participants;
	
	private String location;

	
	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public ArrayList<Person> getHosts() {
		return hosts;
	}

	public void addHost(Person host) {
		this.hosts.add(host);
	}
	public void removeHost(Person host) {
		this.hosts.remove(host);
	}

	public ArrayList<Person> getParticipants() {
		return participants;
	}

	public void addParticipants(Person participant) {
		this.participants.add(participant);
	}
	public void removeParticipants(Person participant) {
		this.participants.remove(participant);
	}

	public String getRoom() {
		return location;
	}

	public void changeLocation(String location) {
		this.location = location;
	}
	
	
	
	
	

}

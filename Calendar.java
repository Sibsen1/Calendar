package calendarclasses;

import java.util.ArrayList;

public class Calendar {
	
	private ArrayList<Appointment> appointments;
	
	private ArrayList<Person> owners;
	
	private boolean isPublic = false;

	public ArrayList<Appointment> getAppointments() {
		return appointments;
	}

	public void addAppointment(Appointment appointment) {
		this.appointments.add(appointment);
	}
	public void removeAppointment(Appointment appointment) {
		this.appointments.remove(appointment);
	}

	public ArrayList<Person> getOwner() {
		return owners;
	}

	public void addOwner(Person owner) {
		this.owners.add(owner);
	}
	public void removeOwner(Person owner){
		this.owners.remove(owner);
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}
	
	

}

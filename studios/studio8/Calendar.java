package studio8;

import java.util.LinkedList;

public class Calendar {

	private LinkedList<Appointment> cal;
	private final String name;
	
	
	
	public Calendar(String name, LinkedList<Appointment> entries) {
		this.name = name;
		this.cal = entries;
	}
	/**
	 * 
	 * @param Add appointment next
	 */
	public void add(Appointment next) {
		cal.add(next);
	}
	/**
	 * 
	 * @param removes cancelled appointment
	 */
	public void delete(Appointment cancel) {
		cal.remove(cancel);
	}
	
	
	public LinkedList<Appointment> getCal() {
		return cal;
	}
	public void setCal(LinkedList<Appointment> cal) {
		this.cal = cal;
	}
	@Override
	public String toString() {
		return name + "'s calendar: " + "[" + cal + "]";
	}
	public static void main(String[] args) {
		Date a = new Date(3,30,2017);
		Date b = new Date(4,1,2017);
		Time x = new Time(1,30,false);
		Time y = new Time(2,30,true);
		LinkedList<Appointments> empty = new LinkedList<Appointments>
		Appointment first = new Appointment(a,x);
		Appointment second = new Appointment(b,y);
		Calendar cal = new Calendar("Doctor Ross",null);
		cal.add(second);
		System.out.println(cal);

	}

}

package studio8;

import java.util.HashSet;
import java.util.LinkedList;

public class Date {
	
	private final int month, day, year;
	private boolean holiday;
	
	public Date(int month, int day, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
		if (this.month == 12 && this.day == 25) {
			this.holiday = true;
		}
		else this.holiday = false;
	}


	@Override
	public String toString() {
		
		if (this.holiday == true) {
		return month + "/" + day + "/" + year + " It's Christmas!";
		}
		else return month + "/" + day + "/" + year;
	}




	public int getMonth() {
		return month;
	}




	public int getDay() {
		return day;
	}




	public int getYear() {
		return year;
	}




	public boolean isHoliday() {
		return holiday;
	}
	
	




	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}


	public static void main(String[] args) {
		Date bush = new Date(9, 11, 2001);
		Date superbowl = new Date(2,5,1950);
		Date pete = new Date(8,12,1996);
		Date rosslandia1 = new Date(8,9,1996);
		Date rosslandia2 = new Date(8,9,1996);
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(bush);
		list.add(superbowl);
		list.add(pete);
		list.add(rosslandia1);
		list.add(rosslandia2);
		System.out.println(list);
		
		HashSet<Date> set = new HashSet<Date>();
		set.add(bush);
		set.add(superbowl);
		set.add(pete);
		set.add(rosslandia1);
		set.add(rosslandia2);
		set.add(rosslandia1);
		System.out.println(set);
	}

}

package studio8;

public class Time {

	private final int hour, minute;
	private boolean twentyFourHour;




	public Time(int hour, int minute, boolean twentyFourHour) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.twentyFourHour = twentyFourHour;
	}




	public int getHour() {
		return hour;
	}




	public int getMinute() {
		return minute;
	}




	@Override
	public String toString() {
		if (twentyFourHour) {
			return hour + ":" + minute;
		}
		else {
			if (hour > 12) {
				return (hour - 12) + ":" + minute + " PM";
			}
			else return hour + ":" + minute + " AM";
		}
	}




	




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
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
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		return true;
	}




	public static void main(String[] args) {
		Time now = new Time(11, 12, false);
		System.out.println(now);
	}

}

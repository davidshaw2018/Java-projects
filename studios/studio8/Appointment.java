package studio8;

public class Appointment {
	
	private final Date date;
	private final Time time;
	
	

	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
	}
	
	



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		Appointment other = (Appointment) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Appointment: " + date + ", at " + time;
	}



	public static void main(String[] args) {
		Date bush = new Date(1,29,1999);
		Time hour = new Time(13, 30, false);
		Time hour2 = new Time(14,30,true);
		Appointment dr = new Appointment(bush,hour);
		Appointment dr2 = new Appointment(bush, hour2);
		System.out.println(dr.equals(dr2));
	}





	

}

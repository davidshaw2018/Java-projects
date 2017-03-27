package lab7;

public class Course {

	private String name;
	private int credits;
	private int numSeats;
	private int seatsRemaining;
	private Student[] roster;

	public Course(String name, int credits, int numSeats) {
		this.name = name;
		this.credits = credits;
		this.numSeats = numSeats;
		this.seatsRemaining = numSeats;
		this.roster = new Student[numSeats];
	}
	/**
	 * 
	 * @return course name
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * 
	 * @param Student s
	 * @return whether student s can be enrolled or not; if he can, add to first unfilled spot
	 */
	public boolean addStudent(Student s) {
		boolean enrolled = false;
		if (this.seatsRemaining > 0) {
			enrolled = true;
		}
		if (enrolled) {
			this.seatsRemaining -= 1;
			int i = 0;
			boolean filled = true;
			while(filled && i < numSeats) {
				if (this.roster[i] == null) {
					filled = false;
				}
				i += 1;
			}
			this.roster[i-1] = s;
			return true;
		}
		else return false;
	}

	/**
	 * 
	 * @return remaining # of seats
	 */
	public int getRemainingSeats() {
		return this.seatsRemaining;
	}
	/**
	 * 
	 * @return list of roster names
	 */
	public String generateRoster() {
		String names = "";
		for (int i = 0; i < roster.length;++i) {
			if (roster[i] != null) {
			names += roster[i].getName() + "\n";
			}
		}
		return names;
	}
	/**
	 * 
	 * @return gpa average of all students on roster
	 */
	public double averageGPA() {
		double totalGPA = 0.0;
		int numStudents = 0;
		for (int i = 0; i < numSeats; ++i) {
			if (roster[i] != null) {
				totalGPA += roster[i].getGPA();
				numStudents += 1;
			}
		}
		if (numStudents > 0) {
			return totalGPA/numStudents;
		}
		else return 0;
	}
	/**
	 * 
	 * @return "Course name and # of credits"
	 */
	public String toString() {
		return this.name + ", " + this.credits + " credits.";
	}

	public static void main(String[] args) {
	}

}

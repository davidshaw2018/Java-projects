package lab7;

public class Student {

	private String name;
	private int id;
	private double gpa;
	private int credits;

	public Student(String firstName, String lastName, int i) {
		this.name = firstName + " " + lastName;
		this.id = i;
		this.gpa = 0.0;
		this.credits = 0;
	}
	/**
	 * 
	 * @param Student x
	 * @return x's first name + space + x's last name
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * 
	 * @return student's id #
	 */
	public int getStudentID() {
		return this.id;
	}
	/**
	 * check number of credits, determine class standing
	 * @return 
	 */


	public String getClassStanding() {
		int creds = this.credits;
		String standing = "";
		if (creds < 30) {
			standing = "Freshman";
		}
		else if (creds >= 30 && creds < 60) {
			standing = "Sophomore";
		}
		else if (creds >= 60 && creds < 90) {
			standing = "Junior";
		}
		else standing = "Senior";
		return standing;
	}
	/**
	 * 
	 * @param input grade, score in class
	 * @param creds, number of credits allotted
	 * @return updated gpa
	 */
	public double submitGrade(double grade, int creds) {
		double qualScore = this.gpa * this.credits + grade*creds;
		this.credits += creds;
		this.gpa = (double)Math.round(1000*qualScore / this.credits)/1000;
		return this.gpa;
	}
	/**
	 * 
	 * @return student's gpa
	 */
	public double getGPA() {
		return this.gpa;
	}
	/**
	 * 
	 * @return # of credits
	 */
	public int getCredits() {
		return this.credits;
	}

	public String toString() {
		return this.name + "\nID: " + this.id;
	}
	/**
	 * 
	 * @param Student spouse
	 * @return Student legacy 
	 */
	public Student createLegacy(Student spouse) {
		Student legacy = new Student(this.name,spouse.name,this.id+spouse.id);
		legacy.gpa = (this.gpa+spouse.gpa)/2;
		if (this.credits > spouse.credits) {
			legacy.credits = this.credits;
		}
		else legacy.credits = spouse.credits;
		return legacy;
	}

	public static void main(String[] args) {
		
	}

}

package student_practice10;

public class student {
	
	private int studentnumber;
	private String firstname;
	private String lastname;
	private int year;
	private double fees;
	
	public student() {
		
	}
	
	public student(int sn, String fn, String ln, int yr, double f) {
		
		studentnumber = sn;
		firstname = fn;
		lastname = ln;
		year = yr;
		fees = f;
		
	}

	public int getStudentnumber() {
		return studentnumber;
	}

	public void setStudentnumber(int studentnumber) {
		this.studentnumber = studentnumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
	public void displayinLine() {
		System.out.printf("%14d %-20s %-20s %-6d %10.6f", studentnumber, firstname, lastname, year, fees);
		
	}
	public String toString() {
		String s = String.format("%14d %-20s %-20s %-6d %10.6f", studentnumber, firstname, lastname, year, fees);
		return s;
	}
	
}

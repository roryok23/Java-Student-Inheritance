package student_practice10;

public class undergrad extends student{
	
	private String major;
	private String minor;
	
	public undergrad() {
		
		super();
	}
	
	public undergrad(int sn, String fn, String ln, int yr, double f, String mj, String mn) {
		super(sn, fn,ln, yr, f);
		major = mj;
		minor = mn;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getMinor() {
		return minor;
	}

	public void setMinor(String minor) {
		this.minor = minor;
	}
	@Override
	public String toString() {
		
		String s = String.format("%s %-30s %-20s", super.toString(), major, minor);
		return s;
	}
}

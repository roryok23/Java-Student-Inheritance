package student_practice10;

public class postgrad extends student{
	
	private String thesis;
	private String supervisor;
	private Boolean tutor;
	
	public postgrad() {
		
		super();
	}
	
	public postgrad(int sn, String fn, String ln, int yr, double f, String th, String sp, Boolean t) {
		super(sn, fn, ln, yr, f);
		thesis = th;
		supervisor = sp;
		tutor = t;
		
	}

	public String getThesis() {
		return thesis;
	}

	public void setThesis(String thesis) {
		this.thesis = thesis;
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	public Boolean getTutor() {
		return tutor;
	}

	public void setTutor(Boolean tutor) {
		this.tutor = tutor;
	}
	@Override
	public String toString() {
		
		String s = String.format("%s %-20s %-20s %-40s", super.toString(), thesis, supervisor, tutor);
		return s;
	}
}

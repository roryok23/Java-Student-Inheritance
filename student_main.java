package student_practice10;



public class student_main {

	public static void main(String[] args) {
		undergrad u1 = new undergrad(1, "Tom", "Murphy", 1, 1000, "History", "Geography");
		System.out.printf("%14s %-20s %-20s %-6s %10.6s %-30s %-20s\n", "Student Number", "First Name", "Last Name", "Year", "Fees", "Major", "Minor");
		System.out.println(u1);
		
		postgrad p1 = new postgrad(1, "John", "OKeeffe", 2, 2000, "History", "Mr. OConnor", true);
		System.out.printf("%14s %-20s %-20s %-6s %10.6s %-20s %-20s %-40s\n", "Student Number", "First Name", "Last Name", "Year", "Fees", "Thesis", "Supervisor", "Tutor");
		System.out.println(p1);
		

	}

}

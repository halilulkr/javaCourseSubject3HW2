package javaCourseSubject3HW2;

public class Student extends User{
	
	private String level;

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
	public String getStudentId() {
		return "S" + getNationalIdentity();
	}
}

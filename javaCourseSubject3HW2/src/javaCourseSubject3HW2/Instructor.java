package javaCourseSubject3HW2;

public class Instructor extends User{
	
	private String certificate;
	
	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	
	public String getInstructorId() {
		return "I" + getNationalIdentity();
	}
}

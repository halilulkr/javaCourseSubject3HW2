package javaCourseSubject3HW2;

public class StudentManager extends UserManager{

	@Override
	public void logIn() {
		System.out.println("Sisteme giriþ yapýldý.");
		
	}

	@Override
	public void logOut() {
		System.out.println("Sistemden çýkýþ yapýldý.");
		
	}
	
	public void signIn(Student student) {
		System.out.println(student.getStudentId() + " numaralý hesabýnýz oluþturuldu.");
		
	}
}

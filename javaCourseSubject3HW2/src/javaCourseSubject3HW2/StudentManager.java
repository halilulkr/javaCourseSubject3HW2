package javaCourseSubject3HW2;

public class StudentManager extends UserManager{

	@Override
	public void logIn() {
		System.out.println("Sisteme giri� yap�ld�.");
		
	}

	@Override
	public void logOut() {
		System.out.println("Sistemden ��k�� yap�ld�.");
		
	}
	
	public void signIn(Student student) {
		System.out.println(student.getStudentId() + " numaral� hesab�n�z olu�turuldu.");
		
	}
}

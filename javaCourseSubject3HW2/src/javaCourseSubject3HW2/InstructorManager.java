package javaCourseSubject3HW2;

public class InstructorManager extends UserManager{

	@Override
	public void logIn() {
		System.out.println("Sisteme giriþ yapýldý.");
		
	}

	@Override
	public void logOut() {
		System.out.println("Sistemden çýkýþ yapýldý.");
		
	}
	
	public void insertAssignment() {
		System.out.println("Ödev sisteme eklendi.");
	}
	
	public void teachCourse(Instructor instructor) {
		System.out.println(instructor.getInstructorId() + " numaralý eðitmenimiz kursunuz birazdan baþlayacaktýr.");
	}

}

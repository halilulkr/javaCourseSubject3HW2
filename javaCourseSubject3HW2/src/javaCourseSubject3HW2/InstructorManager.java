package javaCourseSubject3HW2;

public class InstructorManager extends UserManager{

	@Override
	public void logIn() {
		System.out.println("Sisteme giri� yap�ld�.");
		
	}

	@Override
	public void logOut() {
		System.out.println("Sistemden ��k�� yap�ld�.");
		
	}
	
	public void insertAssignment() {
		System.out.println("�dev sisteme eklendi.");
	}
	
	public void teachCourse(Instructor instructor) {
		System.out.println(instructor.getInstructorId() + " numaral� e�itmenimiz kursunuz birazdan ba�layacakt�r.");
	}

}

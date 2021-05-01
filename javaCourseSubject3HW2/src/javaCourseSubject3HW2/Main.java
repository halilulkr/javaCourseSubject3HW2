package javaCourseSubject3HW2;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setGender("Male");
		instructor.setNationalIdentity("1234567");
		instructor.seteMail("bisey@bisey.com");
		
		Student student = new Student();
		student.setFirstName("Halil");
		student.setLastName("Ülker");
		student.setGender("Male");
		student.setNationalIdentity("398461");
		student.seteMail("bisey@bisey.com");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.logIn();
		instructorManager.teachCourse(instructor);
		
		
		System.out.println("--------------------------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.signIn(student);
		studentManager.logOut();
		
	}

}

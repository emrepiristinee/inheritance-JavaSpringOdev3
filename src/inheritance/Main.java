package inheritance;

public class Main {

	public static void main(String[] args) {
		
//		Instructor instructor = new Instructor();
//		instructor.name="Engin";
//		
//		Student student = new Student();
//		student.name="Emre Piriştine";

//		userManager.add(instructor);
//		userManager.add(student);
		
//		UserManager userManager = new UserManager();
//		User[] user = {instructor,student};
//		userManager.addMultiple(user);
		
		AddManager addManager = new AddManager();
		addManager.add(new StudentManager());

	}

}

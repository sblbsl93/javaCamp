package ucuncuDersOdev;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Sibel");
		student1.setLastName("Bosal");
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Ugur");
		student2.setLastName("Duman");
		Student student3 = new Student();
		student3.setId(3);
		student1.setFirstName("Ali");
		student1.setLastName("Ata");	
		
		Instructor ınstructor=new Instructor();
		ınstructor.setId(10);
		ınstructor.setFirstName("Engin");
		ınstructor.setLastName("Demirog");
		
		StudentManager studentManager =new StudentManager();
		studentManager.logIn(student1);
		studentManager.logIn(student2);
		studentManager.logIn(student3);
		
		InstructorManager ınstructorManager=new InstructorManager();
		ınstructorManager.logIn(ınstructor);
		
		
		
		
	}

}

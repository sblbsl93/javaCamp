package ikinciDersOdev;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"C# +ANGULAR");
		Course course2 = new Course(2,"JAVA + REACT");
		Course course3 = new Course(3,"Programlamaya giriş için temel kurs");
		
		Course[] courses= {course1,course2,course3};
		
		System.out.println("Toplam kurs Sayısı : "+courses.length);
		System.out.println(course1.name);
		System.out.println(course2.name);
		System.out.println(course3.name);
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCart(course1);
		courseManager.addToCart(course2);
		courseManager.addToCart(course3);
	}

}

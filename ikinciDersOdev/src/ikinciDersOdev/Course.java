package ikinciDersOdev;

public class Course {
	int id;
	String name;
	
	public Course() {
		System.out.println("Kursa giri� yap�ld�");
	}
	public Course(int id,String name) {
		this();
		this.id=id;
		this.name=name;
	}

}

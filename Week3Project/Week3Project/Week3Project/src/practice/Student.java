package practice;

public class Student {
	private int studId;
	private String major;
	private NameAndAddress nameAdd;
	
	public Student(int id,String m,String name,String add) {
		studId = id;
		major = m;
		nameAdd = new NameAndAddress(name,add);
	}
	
	public void display() {
		System.out.println("Id " + studId  +" major " + major);
		nameAdd.display();
	}
}

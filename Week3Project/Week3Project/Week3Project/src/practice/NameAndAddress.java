package practice;

public class NameAndAddress {
	private String name;
	private String address;
	
	public NameAndAddress(String n,String add) {
		name = n;
		address = add;
	}
	
	public void display() {
		System.out.println("Name is " + name + " address " + address);
	}
}

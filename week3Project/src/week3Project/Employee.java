package week3Project;

public class Employee {
	
	public static int empCount = 0; //static field
	
    //access modifiers: 'private' This cannot be accessed outside the class
	// data encapsulation is implemented here using the 'private' modifiers
	private int empId; //Instance fields : These are also known as instance variable. Each object has it's own copy
	private String name;
	private double salary; //these variables can be accessed using public functions
	
	public Employee() {
		empId = 111;
		name = "abc";
		salary = 0.0;
	}
	
	//constructors can be overloaded
	public Employee(int id, String n , double sal) {
		empId = id;
		name = n;
		salary = sal;
		empCount++;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//static method belong to the class
	public static void displaySalary()
	{
		System.out.println(String.format("The salary is: ", empCount));
	}
	// creating another non static method
	public double calculateNetPay()
	{
		double commission = 5000;
		return (salary + commission);
	}
	
	
	//---------OVER RIDE -------------------
	
	//we use over ride to modify the existing method 
	
	@Override
	public String toString() {
		return "id is " + empId + " name " + name + " Salary " + salary;
	}
}

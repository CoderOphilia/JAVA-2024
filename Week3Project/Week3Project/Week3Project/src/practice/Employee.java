package practice;

public class Employee {
	public static int empCount = 0;
	public final static int ORG_ID = 12121212; 
	private int empId;
	private String name;
	private double salary;
	
	
	public Employee(int id,String n,double sal) {
		empId = id;
		name = n;
		salary = sal;
		empCount++;
	}
	
	public Employee() {
		/*empId = 111;
		name = "abc";
		salary = 0.0;*/
		this(111,"abc",0.0);
		empCount++;
	}
	
	public Employee(int id) {
		/*empId = 111;
		name = "abc";
		salary = 0.0;*/
		this(id,"abc",0.0);
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
	
	public static void displayEmpCount() {
		System.out.println("number of employees " + empCount);
	}
	
	public double calculateNetPay() {
		double commision = 5000;
		return (salary + commision);
	}
	
	@Override
	public String toString() {
		return "id is " + empId + " name " + name + " salary " + salary + " "+ 
				ORG_ID;
	}
	
		
}

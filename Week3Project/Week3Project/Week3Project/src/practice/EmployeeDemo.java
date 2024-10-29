package practice;

import java.time.LocalDate;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.PI);
		System.out.println(Math.pow(4,5));
		LocalDate today = LocalDate.now();
		System.out.println("today is " + today);
		System.out.println(today.getMonth());
		LocalDate gradDate = LocalDate.of(2024, 11, 9);
		System.out.println("The grad day is " + gradDate);
		
		Employee emp1 = new Employee();
		System.out.println(emp1);
		Employee.displayEmpCount();
		
		/*System.out.println(emp1.getName() + " " + emp1.getEmpId() + 
				" " + emp1.getSalary());*/
		int id = 8999;
		Employee emp2 = createEmpObj(id,"David",89000);
		Employee emp3 = createEmpObj(id,"Sam",99000);
		/*Employee emp2 = new Employee(id,"David",89000);
		System.out.println(emp2.getName() + " " + emp2.getEmpId() + 
				" " + emp2.getSalary());*/
		displayInfo(emp2);
		System.out.println(emp2.getSalary());
		Employee.displayEmpCount();
		
	}
	
	public static Employee createEmpObj(int id,String n, double sal) {
		Employee emp = new Employee(id,n,sal);
		return emp;
	}
	
	public static void displayInfo(Employee emp) {
		System.out.println(emp.getName() + " " + emp.getEmpId() + " "
				+ emp.getSalary());
		emp.setSalary(6666);
	}

}








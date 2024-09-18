package week3Project;

public class EmployeeDemo {

	public static void main(String[] args) {
		// className objectName = new Constructor();
        Employee emp1 = new Employee();
        //System.out.println(emp1.getName()+ " "+ emp1.getEmpId() + " " + emp1.getSalary());
	    System.out.println(emp1); //only pass the object when there is a toString() function
	    
        int id = 4555;
        Employee emp2 = new Employee(id, "David", 89000);
        //System.out.println(emp2.getName()+ " "+ emp2.getEmpId() + " " + emp2.getSalary());
        System.out.println(emp2);
        
        //Accessing the static method using the class name
        Employee.displaySalary();
	}

}

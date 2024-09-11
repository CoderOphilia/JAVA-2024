package JPane;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, args);
		final double INTEREST_RATE = 7.5;
		int width = 5;
		long aLongVar = 5227682791801L;
		boolean check = true;
		double length =  7.8;
		float height = 9.9f;
		char ch = '$';
		
		/*String str = "abc";
		System.out.println(" The width is: " + width + "\n The length is " + length + "\n The height is "+ height);
        System.out.println(
        		"""
        		 The width is
        		 The length is 
        		 The height is
        		"""
        		);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        
        input.nextLine();
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        //System.out.println("Hello, " + name);
        
        
        System.out.println("Hello, " + name + "\nage: " + age);*/
		
		String strHours = JOptionPane.showInputDialog(null, "Enter number of hours worked", 
				"Input Hours", 
				JOptionPane.ERROR_MESSAGE);
		double dHours = Double.parseDouble(strHours);
		final double PAY_RATE = 37.5;
		double salary = dHours * PAY_RATE;
		
		
		int selection = JOptionPane.showConfirmDialog(null, "Would you like to continue?", "Confirm Box", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.ERROR_MESSAGE);
		System.out.println("The selection is " + selection); //This will give the console output
		
		JOptionPane.showMessageDialog(null,"The salary is " + salary);
		
		
	}

}

package chapter2;
//import javax.swing.JOptionPane;
import java.util.Scanner;
public class InchesToFeetInteractive {

	public static void main(String[] args) {
		
		/*
		 . Write a program that declares a variable named inches, which holds a length in inches, and assign a 
value. Display the value in feet and inches; for example, 86 inches becomes 7 feet and 2 inches. Be sure to 
use a named constant where appropriate. Save the program as InchesToFeet.java.
b. Write an interactive version of the InchesToFeet class that accepts the inches value from a user. 
Save the class as InchesToFeetInteractive.java.
		 */
		
		double inches;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length in inches: ");
		inches = input.nextInt();
		
		//String strLength = JOptionPane.showInputDialog(null, "Enter the length in inches: ");
		//double dLength = Double.parseDouble(strLength);
		final double FEETS_UNIT = 12;
		double display_length_feets = inches / FEETS_UNIT;
		int int_feet = (int)display_length_feets / 1;
		double remainder = inches % FEETS_UNIT;

		System.out.println("The length is " + int_feet+" feet and " + remainder + " inches");
		//JOptionPane.showMessageDialog(null,"The length is " + int_feet+" feet and " + remainder + " inches");

	}

}

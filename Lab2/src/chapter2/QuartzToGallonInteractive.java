package chapter2;
import java.util.Scanner;

public class QuartzToGallonInteractive {

	public static void main(String[] args) {
		/*
		 b. Convert the QuartsToGallons program to an interactive application. Instead of assigning a 
value to the number of quarts, accept the value from the user as input. Save the revised program as 
QuartsToGallonsInteractive.java
		  */
		
		final int NUMBER_OF_QUARTZ_IN_GALLON = 4;
		
		int quartsNeeded;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the quartz needed: ");
		quartsNeeded = input.nextInt();
		
		int gallons = quartsNeeded/NUMBER_OF_QUARTZ_IN_GALLON;
		int remaining = quartsNeeded%NUMBER_OF_QUARTZ_IN_GALLON;
		System.out.println("A job that needs "+quartsNeeded+" quarts requires "+ gallons+" gallons plus "+remaining+" quarts");
		

		 

	}

}

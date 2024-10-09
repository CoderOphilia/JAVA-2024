package chapter2;

public class QuartsToGallons {

	public static void main(String[] args) {
		/*
a.Write a program that declares a named constant to hold the number of quarts in a gallon (4). Also 
declare a variable to represent the number of quarts needed for a painting job. Name the variable 
quartsNeeded, and assign 18 to it. Compute and display the number of gallons and quarts needed for 
the job. Display explanatory text in the format A job that needs 18 quarts requires 4 gallons plus 2 quarts. 
Save the program as QuartsToGallons.java.

		  */
		
		final int NUMBER_OF_QUARTZ_IN_GALLON = 4;
		int quartsNeeded = 18;
		int gallons = quartsNeeded/NUMBER_OF_QUARTZ_IN_GALLON;
		int remaining = quartsNeeded%NUMBER_OF_QUARTZ_IN_GALLON;
		System.out.println("A job that needs "+quartsNeeded+" quarts requires "+ gallons+" gallons plus "+remaining+" quarts");
		

	}

}

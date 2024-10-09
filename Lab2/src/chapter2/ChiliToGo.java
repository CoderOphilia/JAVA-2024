package chapter2;

import java.util.Scanner;

public class ChiliToGo {

	public static void main(String[] args) {
		/*
		 . The Huntington Boys and Girls Club is conducting a fundraiser by selling chili dinners to go. The price 
is $7 for an adult’s meal and $4 for a child’s meal. Write a program that accepts the number of each type 
of meal ordered, and display the total money collected for adults’ meals, children’s meals, and all meals. 
Save the program as ChiliToGo.java.
b. In the ChiliToGo program, the costs to produce an adult’s meal and a child’s meal are $4.35 and $3.10, 
respectively. Modify the ChiliToGo program to display the total profit for each type of meal as well as 
the grand total profit. Save the program as ChiliToGoProfit.java.
		 * */
		
		final int ADULT_MEAL = 7;
		final float COST_ADULT_MEAL = 4.35f;
		final float  PROFIT_PER_ADULT_MEAL = ADULT_MEAL - COST_ADULT_MEAL ;
		int adultsMeal;
		int total_adult_meal;
		
		final int CHILD_MEAL = 4;
		final float COST_CHILD_MEAL = 3.10f;
		final float  PROFIT_PER_CHILD_MEAL = CHILD_MEAL - COST_CHILD_MEAL ;
		int childsMeal;
		int total_child_meal;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the adults Meal: ");
		adultsMeal = input.nextInt();
		total_adult_meal = adultsMeal * ADULT_MEAL;
		float profit_adult_food = PROFIT_PER_ADULT_MEAL * adultsMeal;
		
		System.out.println("Enter the childs Meal: ");
		childsMeal = input.nextInt();
		total_child_meal = childsMeal * CHILD_MEAL;
		float profit_child_food = PROFIT_PER_CHILD_MEAL * childsMeal;
		
		int total_price = total_adult_meal + total_child_meal;
		float total_profit = profit_adult_food + profit_child_food;
		
		System.out.println("Total price for Adult's Food: $" + total_adult_meal);
		System.out.println("Total price for Childs's Food: $" + total_child_meal + "\n------------------------------------------------");
		System.out.println("Total price for the Food: $" + total_price + "\n------------------------------------------------");
		System.out.println("Total Profit: $" + total_profit);


	}

}

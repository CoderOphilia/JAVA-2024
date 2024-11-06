package Array;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//creating objects from the BowlingTeam class
		BowlingTeam bowlTeam = new BowlingTeam();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter team name>> "); //input from the user
		String name = input.next();
		bowlTeam.setTeamName(name); 
		
		//creating a for loop to prompt the user to enter the names 4 times
		for(int i = 1 ; i<=4; ++i) {
			System.out.print("Enter team member"+ i +"'s name>> "); //input from the user
			name = input.next();
			bowlTeam.setMembers(i-1, name); //This is an array which is capable of storing more than one data
		}
		
		System.out.println("\nThe name of the team is: "+ bowlTeam.getTeamName());
		System.out.println("\nThe team members are: ");
		for(int i = 0; i<4; ++i) {
			System.out.println(bowlTeam.getMembers(i));
		}
	}
}
		
//		//creating objects
//		//from the employee class
//		Employee[] emps = new Employee[7];
//		
//		final int START_NUM = 101;
//		final double STARTING_SALARY = 20_000;
//		
////		for(int x = 0; x< emps.length; ++x) {
////			emps[x] = new Employee(START_NUM + x , STARTING_SALARY);
////		}
////		
////		//from the inventory class
////		final int NUM_ITEMS = 1000;
////		InventoryItem[] items = new InventoryItem[NUM_ITEMS];
////		for(int x=0; x<NUM_ITEMS; ++x) {
////			items[x] = new InventoryItem();
////		}
//		
//		//displaying the information of employees
//		/*
//		for(int x = 0; x<emps.length; ++x) {
//			System.out.println(emps[x].getEmpNum());
//			emps[x].getEmpSal();
//		}
//		*/
//		
//		//for-each loop top get the information of empployee numbers
//		for(Employee e:emps) {
//			//System.out.println(e.getEmpNum() +" "+ e.getEmpSal());
//		}
//
//	}
//
//}

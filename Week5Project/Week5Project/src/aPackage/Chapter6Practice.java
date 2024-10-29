package aPackage;

import java.util.Scanner;

public class Chapter6Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0,j=0;i<10 && j <5;i+=2,j++) {
			System.out.println("DC");
		}
		int value = 105;
		System.out.println(value++); // 105
		System.out.println(++value); // 107
		
		//to validate user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive value not greater than 100");
		int val = input.nextInt();
		while(val > 100 || val < 0) {
			System.out.println("value entered is invalid "
					+ "enter a valid value");
			val = input.nextInt();
		}
		System.out.println("The value is " + val);
		
		//indefinite loop
		double balance = 25000;
		int response;
		final double INT_RATE = 0.03;
		System.out.println("Would you like to see next "
				+ "year balance enter 1 for yes or "
				+ "anyother key for no");
		
		response = input.nextInt();
		while(response == 1) {
			balance = balance + (balance * INT_RATE);
			System.out.println("Next year balance would " + balance);
			System.out.println("Would you like to see next "
					+ "year balance enter 1 for yes or "
					+ "anyother key for no");
			response = input.nextInt();
		}
		input.close();
		
		
		/*
		//counted loop
		int count = 1;
		while(count <= 5) {
			System.out.println(count);
			count++;
		}*/
	}

}

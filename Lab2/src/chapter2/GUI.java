package chapter2;
import java.util.Scanner;
//import javax.swing.JOptionPane;
public class GUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //JOptionPane.showMessageDialog(null,"Hello");
		
		/*
		1. You Do It Practice Exercises Chapter 2.
		2. Chapter 2 Programming Exercise 4 page# 80.
		3. Chapter 2 Programming Exercise 6 page# 80.
		4. Chapter 2 Programming Exercise 8 page# 81.
		5. Chapter 2 Programming Exercise 10 page# 81.
		6. You Do It Practice Exercises Chapter 3 and 4.
		7. Chapter 3 Programming Exercises 7, 8 and 11 pages 112 and 113. 
		 */
		int age;
		String name;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter your name: ");
		name = input.nextLine();
		System.out.println("Hello, "+name+"\nYou are "+age+" years old.");
		
	}

}

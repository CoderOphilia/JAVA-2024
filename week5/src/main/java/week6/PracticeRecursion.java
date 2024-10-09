package week6;

public class PracticeRecursion {

	public static void main(String[] args) {
		
		//displayMessageRec(5);
		int a = factorialRec(5);
		//System.out.println(a);
		int s = sumRec(5);
		//System.out.println(s);
		
		int e = exponentialRec(2, 3);
		//System.out.println(e);
		
		int result = GcdRec(24,42);
		System.out.println(result);
	}
	

	//Factorial using recursive
	public static int factorialRec(int n){
		if(n ==1) 
			return n;
		else
			return n * factorialRec(n -1);
	}
	
	//write a method to find the GCD
	public static int GcdRec(int a, int b) {
		if(b==0)
			return b;
		else
		    return GcdRec(b, a%b);
	}
	
	//write a method that finds the sum of all the numbers from 1-5
	public static int sumRec(int n) {
		if (n==1)
			return n;
		else
			return n + sumRec(n-1);
	}
	
	public static int exponentialRec(int n, int m) {
		int z;
		if (m==1)
			return n;
		else
			 z = n;
			 n = n* z;
			 return exponentialRec(n, m-1);
	}
	
	public static void displayMessageRec(int count) {
		//recursive method will always receive an input
		//base case --> This is like a stop point 
		if(count == 1) 
			System.out.println("CSIS 2175");
		//recursive case --> call the function, else statement goes here
		else {
			System.out.println(count);
			displayMessageRec(count -1);
		}
		

	}

}

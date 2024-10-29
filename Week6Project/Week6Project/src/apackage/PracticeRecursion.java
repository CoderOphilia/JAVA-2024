package apackage;

public class PracticeRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		displayMessageRec(10);
		//factorial(); 
		System.out.println(factorialRec(5));
	}

	public static void displayMessageRec(int count) {
		
		if(count == 1) //base case
			System.out.println(count);
		else {
			System.out.println(count);
			displayMessageRec(count-1); //recursive case
		}

	}
	
	public static void factorial() {
		int factorial=1;
		for(int i = 1; i<6; i++) {
			factorial = factorial*i;
		}
		System.out.println(factorial);
	}
	
	public static int factorialRec(int n) {
		if(n == 1)
			return n;
		else
			return n * factorialRec(n-1);
	}
	
	
	
	
}

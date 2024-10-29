package practice;

public class Chapter3Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		int aVar = 10;
		System.out.println(String.
				format("The string is %s and aVar is %d, %.2f", 
						str,aVar,56.45)); 
		System.out.println(String.
				format("The string is %1$s and aVar is $%3$.2f, %2$d", 
						str,aVar,56.45)); 
		calculateGross();
		double rate = 27.5;
		int hours = 45;
		double gross = calculateGross(rate,hours); //method call
		System.out.println(String.format("The gross pay is $%.2f"
				, gross));
		
		gross = calculateGross(45,20.5); //method call
		System.out.println(String.format("The gross pay is $%.2f"
				, gross));
		int iVar = 10;
		
		/*char aChar = 'a';
		System.out.println(String.format("The char is %c", aChar));*/
	}

	public static void calculateGross() {
		double rate = 27.5;
		double hours = 45;
		double gross = rate * hours;
		System.out.println(String.format("The gross pay is $%.2f"
				, gross));
	}
	
	public static double calculateGross(double rate,double hours) {
		double gross = rate * hours;
		return gross;		
	}
	
	public static double calculateGross(int rate,int hours) {
		double gross = rate * hours;
		return gross;		
	}
}

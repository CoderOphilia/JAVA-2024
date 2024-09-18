package week3Project;

public class week3Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double due = computeBill();
		System.out.println(String.format("Total due: %.2f", due));
		
		
		double PAY_RATE = 27.5;
		double hours = 45;
		//calculateGross(); //method call
		//calculateGross(hours); //method overloading
		
		//double gross = calculateGross1(PAY_RATE, hours);
		//System.out.println(String.format("The gross pay is $%.2f", gross));
	}
	
	public static void calculateGross() { //while declaring the method, we need to add the keyword static
		final double PAY_RATE = 37.5;
		double hours = 40;
		double gross = PAY_RATE * hours;
		System.out.println(String.format("The gross pay is $%.2f", gross));
		
		//------------More string format --------------------------
		String str = "abc";
		int aVar = 10;
		// %s will be replaced by the first string and %d will be replaced with a variable
		// % will behave like place holder
		//System.out.println(String.format("the string is %s and aVar is %d, %.2f", str, aVar, 56.2)); 
		
	}
	
	public static double calculateGross1(double PAY_RATE, double hours) {
		double gross = PAY_RATE * hours;
		return gross;
	}
	
	//---------------METHOD OVERLOADING-------------
	//same name method, different parameters
	
	public static void calculateGross(double hours) {
		double gross = 20 * hours;
		System.out.println(String.format("The gross pay is $%.2f", gross));
		
	}
	
	//---------------Question 11 in page 112------------------
	
	public static double computeBill() {
		double price = 14.99;
		double tx = price * 0.08;
		double due = price + tx;
		return due;
	}
	
    public static double computeBill(double quantityOrdered) {
    	double price = 14.99;
    	double tx = price * 0.08;
		double due = (price + (tx)) * quantityOrdered;
		return due;
	}
    
    public static double computeBill(double quantityOrdered, double coupon) {
    	double price = 14.99;
    	double tx = price * 0.08;
		double due = ((price + (tx)) - coupon) * quantityOrdered;
		return due;
	}

}

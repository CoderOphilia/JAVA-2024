package chapter3;
import java.util.Scanner;

public class PaintCalculator {

	public static void main(String[] args) {
		// Calling the methods
		float price = calculate_paint_price(paint_needed());
		String mystr = "Total Price: %.2f";
		System.out.printf(mystr,price);
	}
	
	public static float calculate_area() {
		
		
		//--------GEtting User Input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length: ");
		float length = input.nextFloat();
		
		System.out.println("Enter the Width: ");
		float width = input.nextFloat();
		
		System.out.println("Enter the height: ");
		float height = input.nextFloat();
		
		float wall_area = 2 * (length * height) + 2 * (width * height);
		return wall_area;
	}
	
	public static float paint_needed() {
		final float WALL_COVERAGE = 350.0f;
		float wall_area = calculate_area();
		float paint_needed_ = WALL_COVERAGE * wall_area;
		String mystr = "Gallons of paint needed is %.2f";
		System.out.printf(mystr,paint_needed_);
		return paint_needed_;
	}
	
	public static float calculate_paint_price(float gallonsNeeded) {
		final float PAINT_PRICE_PER_GALLON = 32.0f;
        // Price is gallons needed times the price per gallon
        return gallonsNeeded * PAINT_PRICE_PER_GALLON;
    }

}

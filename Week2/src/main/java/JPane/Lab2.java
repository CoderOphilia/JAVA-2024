package JPane;

import javax.swing.JOptionPane;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//---------------Lab2--------
		double inches = 70;
		String strLength = JOptionPane.showInputDialog(null, "Enter the length in inches: ");
		double dLength = Double.parseDouble(strLength);
		final double FEETS_UNIT = 12;
		double display_length_feets = dLength / FEETS_UNIT;
		int int_feet = (int)display_length_feets / 1;
		double remainder = dLength % FEETS_UNIT;
//		double remainder = 
		System.out.println("The length is " + int_feet+" feet and " + remainder + " inches");
		JOptionPane.showMessageDialog(null,"The length is " + int_feet+" feet and " + remainder + " inches");
	}

}

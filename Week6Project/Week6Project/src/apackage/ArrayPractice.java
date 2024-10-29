package apackage;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[5];
		double[] dArray = {3.4,5.6,7.7};
		int count = 5;
		
		for(int i=0;i<scores.length;i++)
			scores[i] = count++;
		
		for(int i=3;i<scores.length;i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		
		for(int v: scores) { //enhanced for loop or for each loop
			System.out.print(v + " ");
		}
		System.out.println();
		
	}

}

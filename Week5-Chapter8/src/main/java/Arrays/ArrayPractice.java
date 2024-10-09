package Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		int[] scores = new int[5];
		double[] dArray = {3.4, 5.6, 7.7};
		
		int count =5;
		for(int i=0; i<scores.length; i++) {
			scores[i] = count++;
		}
		
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i] + " ");
		}
		
		//FOR-EACH LOOP
		for(int v: scores) { //enhanced for loop
			System.out.println(v+" ");
		}
		System.out.println(" ");
 
	}

}

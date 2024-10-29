package practice;

public class Chapter5Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores = 67, bonus = 6;
		//boolean aVar = scores > 50;
		/*if(scores > 50 && bonus >5) {
			System.out.println("good score");
			System.out.println("Good job");
		}
		else {
			System.out.println("bad score");
		}
			
		if(scores > 50) {
			if(bonus >5) {
				System.out.println("good score");
				System.out.println("Good job");
			}
			else {
				
			}
		}
		else {
			System.out.println("bad score");
		}*/
		char deptCode = 'a';
		String deptName ="";
		switch(deptCode) {
			case 'a':
			case 'A':
				deptName = "Accounting";
				System.out.println("ACC Dept");
				break;
			case 'b':
			case 'B':
				deptName = "Business";
				break;
			case 'c':
			case 'C':
				deptName = "CSIS";
				break;
			default:
				deptName = "Invalid";
				break;
		}
		
		System.out.println("dept name is " + deptName);
	
	//switch expression
	switch(deptCode) {
		case 'a','A' -> deptName = "Accouting";
		case 'b','B'-> deptName = "Business";
		default -> deptName = "Invalid";
	}
	System.out.println("dept name is " + deptName);
	
	System.out.println(
			switch(deptCode) {
				case 'a','A' -> "Accouting";
				case 'b','B'-> "Business";
				default ->  "Invalid";
			}
	);
	deptCode = 'd';
	deptName = switch(deptCode) {
		case 'a','A' -> "Accouting";
		case 'b','B'-> "Business";
		default ->  "Invalid";
	};
	
	System.out.println("dept name is " + deptName);
	
	}
}





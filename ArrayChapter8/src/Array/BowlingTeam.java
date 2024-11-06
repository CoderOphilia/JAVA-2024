//chapter 8 Array - You do it question from page 280 in Jva Programming 10th edition text book
package Array;

public class BowlingTeam {
	 	private String teamName;
	 	private String[] members = new String[4];
	 	
		public String getTeamName() {
			return teamName;
		}
		public void setTeamName(String teamName) {
			this.teamName = teamName;
		}
		
		public String getMembers(int number) {
			if(number >= 0 && members.length==4) {
				return members[number];
			}
			return null;
		}
		
		public void setMembers(int number, String name) {
			if(number >= 0 && members.length==4) {
				members[number] = name;
			}
		}
	 
}

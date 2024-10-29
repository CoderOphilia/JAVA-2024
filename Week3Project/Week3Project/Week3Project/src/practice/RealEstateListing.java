package practice;

public class RealEstateListing {
	private int listingNum;
	private double price;
	private HouseData hd;
	
	public RealEstateListing(int num,double price,String add,int sf) {
		listingNum = num;
		this.price = price;
		hd = new HouseData(add,sf);
	}
	
	public void display() {
		System.out.println("listing number " + listingNum + 
				" price " + price + " address " + hd.address + 
				" sqft " + hd.sqft);
		
	}
	
	private class HouseData {
		private String address;
		private int sqft;
		
		public HouseData(String add,int sf) {
			address = add;
			sqft = sf;
		}
	}
	
}

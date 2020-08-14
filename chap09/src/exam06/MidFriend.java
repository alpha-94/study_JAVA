package exam06;

class MidFriend extends Friend{
	private String cls;
	
	MidFriend(String name, String phoneNum, String address, String cls){
		super(name, phoneNum, address);
		this.cls = cls;
	}
	
	public void displayMidFriendInfo() {
		super.displayFriendInfo();
		System.out.println("반 : " + cls);
	}
	
	
	
}

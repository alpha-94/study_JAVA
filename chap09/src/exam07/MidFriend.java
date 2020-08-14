package exam07;

class MidFriend extends Friend{
	private String cls;
	
	MidFriend(String name, String phoneNum, String address, String cls){
		super(name, phoneNum, address);
		this.cls = cls;
	}
	
	public void displayFriendInfo() {
		super.displayFriendInfo();
		System.out.println("반 : " + cls);
	}
	
	public String getFriendInfo() {
		// TODO Auto-generated method stub
		return cls;
	}
	
}

package exam06;

public class HighFriend extends Friend{

	private String job;
	
	HighFriend(String name, String phoneNum, String address, String job){
		super(name, phoneNum, address);
		this.job = job;
		
		
	}
	
	//맴버 메서드
	
	public void displayHighFriendInfo() {
		super.displayFriendInfo();
		System.out.println("직업 : " + job);
	}
	
}

package exam07;

public class UnivFriend extends Friend{
	
	private String major;
	
	//생성자 호출
	UnivFriend(String name, String phoneNum, String address, String major){
		super(name, phoneNum, address);
		this.major = major;
		
		
	}
	
	//맴버 메서드
//	public void displayUnivFriendInfo(){
	//오버라이딩!!!!!!!!!!!
		public void displayFriendInfo() {
		super.displayFriendInfo();
		System.out.println("전공 : " + major);
	}
		public String getFriendInfo() {
			// TODO Auto-generated method stub
			return major;
		}
	
}

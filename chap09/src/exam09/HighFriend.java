package exam09;

public class HighFriend extends Friend{

	private String job;
	
	HighFriend(String name, String phoneNum, String address, String job){
		super(name, phoneNum, address);
		this.job = job;
		
		
	}
	
	//맴버 메서드
	
//	public void displayHighFriendInfo() {
	//오버라이딩!!!!!!!!!!!
		public void displayFriendInfo() {
		super.displayFriendInfo();
		System.out.println("직업 : " + job);
	}

//	@Override
//	public void displayBasicFriendInfo() {
//		// TODO Auto-generated method stub
//		
//	}//오버라이딩 없는상태에서 add 할때 나오는 오버라이딩 기본 문구
		
		//이름 , 직업 매서드
		public void displayBasicFriendInfo() {
			System.out.println("이름  : " + getName());
			System.out.println("직업 : " + job);
		}//주석처리 하게 되면 클래스 자체에 error 가 나게 됨
		//왜냐면 abstract 명령어를 쓰게 되면 오버라이딩을 해야하기 때문
	
}

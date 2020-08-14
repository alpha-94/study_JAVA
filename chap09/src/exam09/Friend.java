package exam09;

 abstract class Friend {//공통특징

	 //이름 , 폰번, 주소
	
	 
	 //필드값
	 private String name;
	 private String phoneNum;
	 private String address;
	 
	 //생성자
	 
	 Friend(String name, String phoneNum, String address){
		 this.name = name;
		 this.phoneNum = phoneNum;
		 this.address = address;
		 
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 public void displayFriendInfo() {
		 System.out.println("이름 : " + name);
		 System.out.println("폰번호 : " + phoneNum);
		 System.out.println("주소 : " + address);
	 }
	 
//	 public void displayBasicFriendInfo() {
//		 //오버라이딩 목적
//	 } 그래서 abstract 명령어 사용해서 사용할때 밑에처럼
	 abstract public void displayBasicFriendInfo();
	 //오버라이딩 목적으로 쓸 수 있는 명령어 즉 추상 메서드임
	 
	 
}

package exam07;

 class Friend {//공통특징

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
	 
	 public void displayFriendInfo() {
		 System.out.println("이름 : " + name);
		 System.out.println("폰번호 : " + phoneNum);
		 System.out.println("주소 : " + address);
	 }

	public String getPhoneNum() {
		return phoneNum;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getFriendInfo() {
		// TODO Auto-generated method stub
		return name;
	}

	
	 
	 
	 
}

package exam01;

 class Student extends Friend{

	
	private String university;
//	학교명
	private String major;
//	전공
	
	Student(String name, String birth, String address, String email, String university, String major){
		super(name, birth, address, email); 
		//자식코드의 초기화 의무 - Student 를 사용하려면 상속한 Firend 의 생성자를 같이 호출
		// 생성자는 결국 필드 초기화 목적으로 사용하게 되어있음.
		this.university = university;
		this.major = major;

	}
	 
	public void displayStudentInfo() {
		displayFriendsInfo();
		System.out.println("학교명 : " + university);
		System.out.println("전공  : " + major);
		
	}
	 
	

}

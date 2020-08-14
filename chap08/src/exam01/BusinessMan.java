package exam01;

public class BusinessMan extends Friend {

	
	private String company;
//	회사명
	private String department;
//	소속부서
	private String businessNum;
//	사번
	BusinessMan(String name, String birth, String address, String email,
			String company,String department,String businessNum){
		super(name, birth, address, email); 
		this.company = company;
		this.department = department;
		this.businessNum = businessNum;
		
	}
	public void displayBusinessManInfo() {
		displayFriendsInfo();
		System.out.println("회사명 : " + company);
		System.out.println("부서명  : " + department);
		System.out.println("사번  : " + businessNum);
		
	}
	
	
}

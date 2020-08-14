package exam10;

public class AbstractInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PersonalStorge personal = new PersonalStorgeImplement();
		PersonalStorge personal = new PersonalStorgeThirdparty(1000);
		
		personal.addPersonalInfo("20200511", "홍길동");
		
		//UI 구현
		String name = personal.searchName("20200511");
		System.out.println(name);
	}

}

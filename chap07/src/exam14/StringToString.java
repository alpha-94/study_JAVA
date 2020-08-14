package exam14;


class Friend{
	
	
	private String name;
	
	Friend(String name){
		this.name = name;
		
	}
	
	public String toString() {
		return "제 이름은" + name + "입니다.";
		
	}
	
	
}

public class StringToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "홍길동" ;
		System.out.println(name); //참조변수
		
		
		Friend friend1 = new Friend("세종대왕");
		
		System.out.println(friend1); //참조변수
		//toString을 호출하지 않았지만 toString메서드를 호출 한 것 처럼 됨.
		//println 메서드 오버로딩
		
		
	}

}

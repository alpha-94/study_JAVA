package exam08;

class Person{
	private String name;
	
	Person(String name){
		this.name = name;
	}

//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}
//

 // @Override 
public String toString() {
// TODO Auto-generated method
		return name+"입니다.";

 }

	
	
}


public class UseObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person("홍길동");

		
		System.out.println(person);
		//메서드 출력호출 시 to String 오버라이딩 이용해서 사용 가능
		
	}

}

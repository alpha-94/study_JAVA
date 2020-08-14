package exam09;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person cheolsoo = new Person("철수", 202004081);
		Person younghee = new Person("영희");

		//참조변수 이름 구분으로 접근
		//new 동작 4가지 
		//1> 메모리할당   2> this 할당
		// this  는 new 로 새로 할당 할 시 새로운 값으로 지정 
		//예를들어 철수는 주소값 1000 / 영희 주소값 2000 등 ....
		//-------------------------------------------------------
		//    |        this(시작 주소값)        | name |  milID  |   생성자   |   showinfo()   |
		//		this.name , this.milID , this.showinfo() 즉 Person 의 생성자 호출 시
		//     명시성 강화
		//
		//
		//
		
		cheolsoo.showInfo();
		younghee.showInfo();
		//참조변수 닷(this)
	}

}

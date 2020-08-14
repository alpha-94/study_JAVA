package exam04;

public class Mart {//자료형은 default / public 만

	private String name;
	private int benefit ; // 이윤
	private int numOfApple ; // 남은 사과 갯수
	final int APPLE_PRICE; // 전부 대문자는 상수라는 것 인지
	// private ~ CLASS 안에서만 사용 가능
	//protected ~ default + 상속 클래스
	//public ~ 어디에서든지의 접근 허용 
	//default ~ 클래스 내부 & 동일 패키지
	
	
	//public void 를 사용하지 않아 메소드는 아니지만 모양은 메서드.. = 생성자
	
	//Mart(){}
	
	public Mart(String Martname, int apple, int price){ //  생성자 생성 요건 :: 클래스 이름과 동일 해야함
							 //  초기화 하는 용도
		name = Martname;
		numOfApple = apple;
		APPLE_PRICE = price;
		
		
	}
	
	
	//메소드(셀링)
	
	public int sellApple(int money) {
		int num = 0;
		
		num = money / APPLE_PRICE;
		
		numOfApple -= num;
		benefit += money;
		
		return num;
		
	}
	//메소드(판매 결과)
	public void displayMart() {

		System.out.println(name + " 이윤 : " + benefit);
		System.out.println("남은 사과의 갯수 : " + numOfApple);
		
	}
	


}

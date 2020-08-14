package exam02;

class Mart{
	int benefit ; // 이윤
	int numOfApple ; // 남은 사과 갯수
	
	
	//public void 를 사용하지 않아 메소드는 아니지만 모양은 메서드.. = 생성자
	
	Mart(){}
	
	Mart(int apple){ //  생성자 생성 요건 :: 클래스 이름과 동일 해야함
							 //  초기화 하는 용도
		numOfApple = apple;
		System.out.println("현재 남은 사과의 갯수는 :: " + numOfApple + "  개 입니다 !");
		
	}
	
	
	//메소드(셀링)
	
	public void sellApple(int money) {
		int num = 0;
		
		num = money / 1000;
		
		numOfApple -= num;
		benefit += money;
		
	}
	//메소드(판매 결과)
	public void displayMart() {

		System.out.println("마트이윤 : " + benefit);
		System.out.println("남은 사과의 갯수 : " + numOfApple);
		
	}
	
}

public class AppleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Mart e_mart;
		
		e_mart = new Mart(1500);
		//new 의미 :: 1 번 클래스 호출 , 2번 Mart() 호출
		
		e_mart.sellApple(3000);
		
		e_mart.displayMart();
//		
//		e_mart.sellApple(3000);
//		
//		e_mart.displayMart();
		
		
		
		
//		Mart home_plus;
//		
//		home_plus = new Mart();
//		
//		
//		
//		home_plus.sellApple(2000);
//		
//		home_plus.displayMart();
		
		
		
		
		
		
	}

}

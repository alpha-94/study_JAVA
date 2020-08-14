package exam03;

class Mart{
	String name;
	int benefit ; // 이윤
	int numOfApple ; // 남은 사과 갯수
	final int APPLE_PRICE; // 전부 대문자는 상수라는 것 인지
	
	
	
	//public void 를 사용하지 않아 메소드는 아니지만 모양은 메서드.. = 생성자
	
	//Mart(){}
	
	Mart(String Martname, int apple, int price){ //  생성자 생성 요건 :: 클래스 이름과 동일 해야함
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

class Buyer{
	String name;
	int myMoney;
	int numOfApple;
	
	
	
	
	Buyer(String Buyername, int money){
		name = Buyername;
		myMoney = money;
	}//생성자 제공 // 클래스 안에서만 가능
	
	public void buyerApple(int money, Mart mart) {
		myMoney -=money;
		numOfApple += mart.sellApple(money);

	}
	//가계부
	public void displayBuyer() {
		System.out.println(name +" 가 구입한 사과 갯수 : " + numOfApple);
		System.out.println("잔고 : " + myMoney);
		
	}
}


public class AppleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mart e_mart = new Mart("이마트",1000,500);
		//Mart e_mart;
		//e_mart = new Mart(1000);
		Mart h_mart = new Mart("홈플러스",900,1000);
		
		Buyer mother = new Buyer("엄마",100000);
		Buyer father = new Buyer("아빠",30000);
		
		
		mother.buyerApple(5000, e_mart);
		mother.buyerApple(1000, h_mart);
		mother.buyerApple(3000, e_mart);
		father.buyerApple(10000, h_mart);
		
		mother.displayBuyer();
		father.displayBuyer();
		
		
		Buyer buyer01 = new Buyer("옆집 아줌마", 1500000);
		
		buyer01.buyerApple(8000, h_mart);
		buyer01.displayBuyer();
		
		e_mart.displayMart();
		h_mart.displayMart();
		
		//e_mart.applePrice = 5000; final int 순간 변경 불가
		
		
	}

}

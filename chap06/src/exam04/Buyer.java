package exam04;

public class  Buyer {

	 String name;
	 int myMoney;
	 int numOfApple;
	
	
	
	
	public Buyer(String Buyername, int money){
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

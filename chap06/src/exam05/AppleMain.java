package exam05;

import exam04.Buyer;
import exam04.Mart;


public class AppleMain {

	public static void main(String[] args) {

		Buyer mother= new Buyer("엄마",50000);
		// Buyer 생성자를 public 지정 해야함
		
		Mart e_mart = new Mart("이마트", 1000, 50000);
		
		mother.buyerApple(5000, e_mart);
		mother.displayBuyer();
		e_mart.displayMart();
		
		
		
	}

}

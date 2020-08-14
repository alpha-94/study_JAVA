package exam04;
// 애플메인의 파일 분리
//사실상 bin 폴더에서 클래스 분리

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
		
//		private 접근의 제약으로 인하여 error
//		System.out.println(e_mart.benefit);
//		System.out.println(h_mart.benefit);// 보안의 취약성
//		
//		e_mart.benefit = -10000;
		
		
		//e_mart.applePrice = 5000; final int 순간 변경 불가
		
		
	

	}

}

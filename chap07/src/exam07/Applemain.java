package exam07;

public class Applemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//new Mart[3];
		
//		Mart eMart = new Mart("이마트 ",100, 500);
//		Mart homeplus = new Mart("홈플 ",200, 1000);
//		Mart walmart = new Mart(" 월마트 ",300, 2000);
		
		Mart[] mart = new Mart[3];
		//메모리는 
		//↓할당
		mart[0] = new Mart("이마트 ",100, 500);
		mart[1] = new Mart("홈플 ",200, 1000);
		mart[2] = new Mart(" 월마트 ",300, 2000);
						
		mart[0].displayMart();//이마트
		mart[1].displayMart();//홈플
		mart[2].displayMart();//월마트
		
		
		
	}

}

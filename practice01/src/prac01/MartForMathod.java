package prac01;

public class MartForMathod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		e_mart(4000);
		h_mart(5000);
		

	}

	public static void e_mart(int money) {
		int num = 0;
		int apple = 1000;
		
		int benefit = 0;
		num = money / 1000;
		
		apple -= num;
		benefit += money;
		
		System.out.println("~~~~~당신의 이마트 장보기 결과~~~~~");
		System.out.println(" 당신은 이마트에서 " + num + "개 의 사과를 사셨으며 가격은 " + money + " 원을 지불하셨습니다.");
		System.out.println("~~~~~홈플러스의 재고 및 이윤의 결과~~~~~");
		System.out.println(" 오늘 사과의 재고는 1000개 입고 되었으며 현재 잔여 사과의 갯수는 " + apple + "개 만큼 남았습니다.");
		System.out.println(" 현재 이윤은 " + benefit + " 원 입니다.");
		
	}
	
	public static void h_mart(int money) {
		int num = 0;
		int apple = 1000;
		
		int benefit = 0;
		num = money / 1000;
		
		apple -= num;
		benefit += money;
		
		System.out.println("~~~~~당신의 홈플러스 장보기 결과~~~~~");
		System.out.println(" 당신은 홈플러스에서 " + num + "개 의 사과를 사셨으며 가격은 " + money + " 원을 지불하셨습니다.");
		System.out.println("홈플러스의 재고 및 이윤의 결과");
		System.out.println(" 오늘 사과의 재고는 1000개 입고 되었으며 현재 잔여 사과의 갯수는 " + apple + " 개 만큼 남았으며,");
		System.out.println(" 현재 이윤은 " + benefit + " 원 입니다.");
	}
	
	
}

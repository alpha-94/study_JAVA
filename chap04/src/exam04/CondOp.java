package exam04;

public class CondOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1 = 50 , num2 = 100;
		int big = 0, diff = 0;
		
		if (num1>num2) {
			System.out.println("num1 이 num2 보다 크다");
			big = num1;
			diff = num1 - num2;
		}else {
			System.out.println("num1 이 num2 보다 작다");
			big = num2;
			diff = num2 - num1;
		}
		System.out.println("큰값 : " + big + "두값의 차 : " + diff);
	
		
		//~~~~~~~삼항 연산자란~~~~~~~~~~
		// ? : ; 세가지( 단, bool 연산자만)
			big = (num1 > num2)? num1: num2;
		//                 (?) 비교       (:)참   (;)거짓
		//  num1  num2 비교 후 참이면 num1 거짓이면 num2 아웃풋
			diff = (num1 > num2)? num1-num2: num2-num1;
		//                   (?) 비교             (:)참           (;)거짓
		// num1  num2 비교 후 참이면 num1(최대값) - num2 
		//                                            거짓이면 num2(최대값)-num1 아웃풋
			System.out.println("큰값 : " + big + "두값의 차 : " + diff);	
			
		
	
	}
	

}

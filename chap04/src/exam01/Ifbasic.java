package exam01;

public class Ifbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 47, num2 = 38;
		
		int result = 0;
		
		result = (num1 * num1 * num2 * num2) / (num1 - num2);
		
		
		if(result>500000) {
			System.out.println("실행결과 값이 500000 이상입니다.");
			System.out.println("결과값 : " + result);
			
			
		}
		
		System.out.println("프로그램 종료");
		
		
	}
}

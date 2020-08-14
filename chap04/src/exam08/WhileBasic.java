package exam08;

public class WhileBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num1 = 1, result = 0;
		
		
		while(num1<=5) {
			
			
			System.out.println("명령문 실행 : " + num1);
			num1 = num1 +1;
			
		}
		
		num1 = 1;
		
		result = 1+2+3+4+5+6+7+8+9+10;
		System.out.println("명령문 실행 : " + result);
		
		result = 0;
		
		while(num1<=100000000) {

			result += num1;
			num1++;
			
		}
		System.out.println("명령문 실행 : " +result);

		

	}

}

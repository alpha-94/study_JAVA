package exam02;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("두개 정수 입력 : ");
		
		Scanner input = new Scanner(System.in);
		
		
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		try {
			System.out.println(num1/num2);	
		}catch(ArithmeticException e) {
			System.out.printf("num2 = %d :: 0인경우 실행되지 않습니다.",num2);
		}
		
		
		
	}

}

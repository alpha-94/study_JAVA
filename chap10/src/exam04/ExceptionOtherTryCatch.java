package exam04;

import java.util.Scanner;

public class ExceptionOtherTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		int[] arr = new int[5];
		
		for(int i = 0; i < 2 ; i++) {
		try {
			System.out.println("피제수 입력 : ");
			int num1 = input.nextInt();
			
			System.out.println("제수 입력 : ");
			int num2 = input.nextInt();
			
			System.out.println("연산결과를 저장할 배열의 인덱스(0~4) 입력 :: ");
			int index = input.nextInt();
			
			arr[index] = num1/num2;
			
		}catch(ArithmeticException e) {
			System.out.println("나눗셈 불가능.");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("배열 범위 초과 \"-1이하  또는 5 이상\" 작성 경우");
		}
		
		}
	}

}

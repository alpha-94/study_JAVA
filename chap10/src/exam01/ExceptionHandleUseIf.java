package exam01;

import java.util.Scanner;

public class ExceptionHandleUseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("피제수 입력 : ");
		int num1 = input.nextInt();
		
		System.out.print("제수 입력 : ");
		int num2 = input.nextInt();
		
//		if(num2!=0) {
		int result = num1 / num2 ;
		System.out.printf(" %d / %d = %d ", num1, num2, result);
//		}
//		else
//		{System.out.printf("num2 = %d :: 0인경우 실행되지 않습니다.",num2);
//		return;
//		}
		
		
		

	}

}

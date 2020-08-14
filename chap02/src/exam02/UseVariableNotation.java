package exam02;

public class UseVariableNotation {

	public static void main(String[] args) {
		
		/*
		 * byte num1; //메모리 할당 ,1바이트 ,정수 담기 
		 * byte num2;
		 */
		byte num1,num2;
		
		
		num1 =  127; //초기화
		//-128~127
		num2 = -128; //초기화
		
		System.out.println(num1 + num2);
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		//숫자 + 문자 => 걍 문자열로 도출
		
		
		int num3=512, num4=250; //변수 선언 동시에 초기화 ㅇㅋ
		System.out.println(num3 + " + " + num4 + " = " +(num3 + num4));
		
		
		num3 = 0x15;  //21
		System.out.println(num3);

		num4 = 0x200; // 512 16진수 표현
		System.out.println(num4);
		int num5;
		
		num5 = 01000;// 512 8진수 표현
		System.out.println(num5);
		
		/* ---- 
		 * ---- 
		 * ----
		 * ----
		 * ----
		 * ----       1100    
		 * ----       0011    
		 * ----       1101     */
	}

}

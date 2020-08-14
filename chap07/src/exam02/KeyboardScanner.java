package exam02;

public class KeyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		//system.out -> 출력
		//system.int -> 입력
		
		System.out.println("덧셈연산 프로그램");
		System.out.print("1번째 정수값 : " );
		double num1 = keyboard.nextDouble();
		
		System.out.print("2번째 정수값 : " );
		double num2 = keyboard.nextDouble();
		
		System.out.print("3번째 정수값 : " );
		double num3 = keyboard.nextDouble();
		
		double result = num1 + num2 + num3;
		
		System.out.println(num1 +"+"+ num2 +"+" +num3 +"="+ result);
		
		//nextDouble 의 enter 처리 때문에 저 밑에 있는 nextLine이 수행이 엔터를 먹어버림
		keyboard.nextLine();
		System.out.print("당신의 이름은?");
		String name = keyboard.nextLine();
		//지맘대로 종료하고 ㅈnextLine 이거 때문에 실행 ㄴ 
		System.out.println("YOUR NAME IS : " + name);
		
	}

}

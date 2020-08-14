package exam07;

public class PostfixOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1 = 7;
		int num2 = 0, num3= 0;
		
		num2 = num1++; //후위증가 연산자 -> num += 1;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		num3 = num1--; //후위증가 연산자 -> num += 1;
		System.out.println("num1 = " + num1); 
		System.out.println("num2 = " + num3); 
		
		
	}

}

package exam01;

public class ArithOp {

	
	//산술연산자
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1 = 20, num2 = 8;
		int resultInt;
		
		resultInt = num1 + num2;
		System.out.println(num1 + "+" + num2 + " = " + resultInt);
		
		resultInt = num1 - num2;
		System.out.println(num1 + "-" + num2 + " = " + resultInt);
		
		resultInt = num1 * num2;
		System.out.println(num1 + "*" + num2 + " = " + resultInt);
		
		resultInt = num1 / num2;
		System.out.println(num1 + "/" + num2 + " = " + resultInt);
		
		resultInt = num1 % num2;
		System.out.println(num1 + "%" + num2 + " = " + resultInt);
		
		double num3 = 7.8, num4 = 3.2;
		double resultDouble;
		
		resultDouble = num3 + num4;
		System.out.println(num3 + "+" + num4 + " = " + resultDouble);

		resultDouble = num3 - num4;
		System.out.println(num3 + "-" + num4 + " = " + resultDouble);
		
		resultDouble = num3 * num4;
		System.out.println(num3 + "*" + num4 + " = " + resultDouble);
		
		resultDouble = num3 / num4;
		System.out.println(num3 + "/" + num4 + " = " + resultDouble);
		
		resultDouble = num3 % num4;
		System.out.println(num3 + "%" + num4 + " = " + resultDouble);
		// 사실상 실수형은 필요 X 
	}

}

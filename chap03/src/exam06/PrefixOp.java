package exam06;

public class PrefixOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int num1 = 7;
		int num2 = 0, num3= 0;
		
		
		
		num2 = ++num1; //전위증가 연산자 num1 += 1;
		System.out.println("num1 = " + num1); //8
		System.out.println("num2 = " + num2); //0
		
		
		num3 = --num1; //전위감소 연산자 num1 -= 1;
		System.out.println("num1 = " + num1); 
		System.out.println("num2 = " + num3); 
		
		
	}

}

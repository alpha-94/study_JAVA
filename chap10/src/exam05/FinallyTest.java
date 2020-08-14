package exam05;

public class FinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean divOk1 = divider(4,2);
		
		
		if(divOk1) {
			System.out.println("연산성공");
		}
		else {
			System.out.println("연산 실패");
		}
		
		divOk1 = divider(4,0);
		if(divOk1) {
			System.out.println("연산성공");
		}
		else {
			System.out.println("연산 실패");
		}

	}
	
	public static boolean divider(int n1, int n2) {
		try {
			int result=n1/n2;
			return true;
		}catch(ArithmeticException e) {
			System.out.println("나눗셈 불가능");
		return false;
		}
		finally {
			System.out.println("finally 실행");
		}
	}

}

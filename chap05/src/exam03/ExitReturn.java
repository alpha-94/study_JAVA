package exam03;

public class ExitReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		divide(10,2);
		
	}

	public static void divide(int num1, int num2) {
		int result = 0;
		if(num2 ==0) {
			System.out.println("0으로 나눌 수 없다.");
			
			return;
		}
		
		result = num1/ num2;
		System.out.println(num1 + "/" + num2 + "=" + result);
		
	}
	
	
}

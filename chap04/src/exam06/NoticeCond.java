package exam06;

public class NoticeCond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1 = 152, num2 = 173;
		
		if(num1 > num2) 
			System.out.println("num1 값이 num2보다 크다");
		else 
			System.out.println("num1 값이 num2보다 작다");
		//한줄일때 가능
		
		if(num1 > num2) {
			if(num1 > 100) 
				System.out.println("1. num1 = " + num1);
			}
		else
			System.out.println("2. num1 = " + num1);
	
	}
}

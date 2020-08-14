package chap05;

public class exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		
		num = multify(1234,567);

		if(num > 50000) {
			System.out.println("50000 이상 이군요");
		}
		
		System.out.println("sys out");
		
	}

	public static  int multify(int num1, int num2) {
		
		int result = 0;
		
		result = num1 * num2 ;
		
		System.out.println(result);
		return result;
		
	}
	
	
}

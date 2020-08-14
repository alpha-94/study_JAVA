package exam02;

public class ObjectEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntNumber num1 = new IntNumber(10);
		//							heap
		//							필드  생성자
		// ㅁ num1     →||→ 		10        ㅁ  
		IntNumber num2 = new IntNumber(20);
		//		heap
		//							필드  생성자
		// ㅁ num2     →||→ 		20        ㅁ  
		
		IntNumber num3 = new IntNumber(10);
		//		heap
		//							필드  생성자
		// ㅁ num3     →||→ 		10        ㅁ  
		
		
		
		if(num1.equals(num2)) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		if(num1.equals(num3)) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		if(num2.equals(num3)) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
	
	}

}

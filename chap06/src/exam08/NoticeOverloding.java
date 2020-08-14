package exam08;

class Adder{
	//자동 형변환 작동
	public int add(int n1, int n2) {
		return n1+n2;
	}
	
	public int add(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	
	public double add(int n1, double n2) {
		return n1 + n2;
		//메소드 오버로딩
	}
	
	public double add(double n1, int n2) {
		return n1 + n2;
		//메소드 오버로딩
	}
	
	public double add(double n1, double n2) {
		return n1 + n2;
		//메소드 오버로딩
	}
	
	//반환형 타입이 다른 것은 오버로딩에 영향을 미치지 않는다.
//	public double add(int n1, int n2) {
//		double result = 0.0;
//		
//		result = n1 + n2;
//	}
	
}

public class NoticeOverloding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adder adder = new Adder();
		
		System.out.println(adder.add(100, 20));
		System.out.println((char)adder.add('A', 10));
		
		
		

	}

}

package exam07;

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
	
}

public class MEthodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultInt = 0;
		double resultDouble = 0;
		
		Adder adder = new Adder();
		resultInt = adder.add(100, 200);
		System.out.println("100 + 200 = " + resultInt);
		
		resultDouble = adder.add(3.14, 2020.88);
		System.out.println("3.14 + 2020.88 = " + resultDouble);
		
		resultInt = adder.add(100, 200, 300);
		System.out.println("100 + 200 + 300= " + resultInt);

		

	}

}

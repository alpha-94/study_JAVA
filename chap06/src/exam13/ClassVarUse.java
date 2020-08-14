package exam13;

class Circle{// 원의 둘레 및 넓이 구현
	private double radius;
	static final double PI = 3.141592; //상수 입니다.
	
	Circle(double rad){
		this.radius = rad;
		
	}
	public void showPerimeter() {//원의 둘레 출력
		double result = 0;
		
		result = 2 * PI * radius;
		
		System.out.println("원 둘레 : "+ result);
	}
	public void showArea() {//원의 넓이 출력
		double result = 0;

		result = 2 * PI * radius * radius;
		
		System.out.println("원 넓이 : "+result);
	}
	
}

public class ClassVarUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle crc1 = new Circle(20);
		crc1.showPerimeter();
		crc1.showArea();
		
		
	}

}

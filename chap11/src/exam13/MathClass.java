package exam13;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("원주율 : " + Math.PI);
		System.out.println("2의 제곱근 : " + Math.sqrt(4));

		System.out.println("파이에 대한 Degree" + Math.toDegrees(Math.PI));

		
		double radian45 = Math.toRadians(45);
		System.out.println(radian45);
		
		System.out.println(Math.sin(radian45));
		
		System.out.println("로그 25  " + Math.log(25));
		
		System.out.println("2의 4승" + Math.pow(2, 4));
		
	}

}


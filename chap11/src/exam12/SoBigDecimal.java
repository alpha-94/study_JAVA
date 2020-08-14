package exam12;

import java.math.BigDecimal;

public class SoBigDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double e1 = 1.6;
		double e2 = 0.1;
		System.out.println("두 실수의 덧셈 결과 : " + (e1+e2));
		System.out.println("두 실수의 곱셈 결과 : " + (e1*e2));
		
		BigDecimal e3 = new BigDecimal("1.6");
		BigDecimal e4 = new BigDecimal("0.1");
		
		BigDecimal addresult3 = e3.add(e4);
		BigDecimal addresult4 = e3.multiply(e4);
		
		System.out.println("두 실수의 덧셈 결과 : " + addresult3);
		System.out.println("두 실수의 곱셈 결과 : " + addresult4);

		
	}

}

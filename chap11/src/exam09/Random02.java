package exam09;

import java.util.Random;

public class Random02 {

	public static void main(String[] args) {
		
		//1~100 임의의 값
		Random random = new Random();
		
		int num = random.nextInt(100)+1;
		System.out.println("1~100 사이의 임의의 값" + num);
		
		float f = random.nextFloat();
		System.out.println("0.0 부터 1.0 사이의 임의의 실수값 : " + f);
		
		boolean b = random.nextBoolean();
		System.out.println("임의의 논리값 : " + b );
	}
}

package exam09;

import java.util.Random;

public class Random01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Random random = new Random();
		
		
//		random.setSeed(System.currentTimeMillis());
		random.setSeed(10);
		
		
		for (int i = 0; i < 10 ; i++) {
			System.out.println(random.nextInt(100));
		}
		

	}

}

package exam11;

import java.math.BigInteger;

public class SoBigInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("최대 정수 : " + Long.MAX_VALUE);
		System.out.println("최소 정수 : " + Long.MIN_VALUE);

//		long num1 = 10000000000;
//		long num2 = -9999999999999999;
		
		
		BigInteger bigValue1 = new BigInteger("1000000000000000");
		BigInteger bigValue2 = new BigInteger("-999999999999999");
		
		BigInteger addResult = bigValue1.add(bigValue2);
		BigInteger multiResult =bigValue1.multiply(bigValue2);
		
		
		
		System.out.println(addResult);
		System.out.println(multiResult);
	}

}

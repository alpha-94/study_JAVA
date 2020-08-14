package exam01;

import java.util.ArrayList;
import java.util.Iterator;

import org.omg.CORBA.INTERNAL;

public class IntroArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num1 = new Integer(10);
		Integer num2 = new Integer(20);
		Integer num3= new Integer(30);
		
		Integer[] numIntegers = new Integer[3];
		
		numIntegers[0] = new Integer(10); 
		numIntegers[1] = new Integer(20); 
		numIntegers[2] = new Integer(30); 
		
		
		ArrayList<Integer> ubstanceInteger = new ArrayList<Integer>();
		
		ubstanceInteger.add(new Integer(10) );
		ubstanceInteger.add(new Integer(20) );
		ubstanceInteger.add(new Integer(30) );
		
//		for (int i = 0; i < ubstanceInteger.size(); i++) {
//			System.out.println(ubstanceInteger.get(i));
//		}
		Iterator<Integer> itr = ubstanceInteger.iterator();
		
		
		//데이터 참조 구문
		while (itr.hasNext()) {//hasNext - set.add 쪽으로 가서 데이터 있는지 확인
													//있으면 true 없으면 false
			System.out.println(itr.next());
			
		}
		
		
		ubstanceInteger.remove(2);
		
		
		System.out.println("++++++");
		
		for (int i = 0; i < ubstanceInteger.size(); i++) {
			System.out.println(ubstanceInteger.get(i));
		}
		System.out.println("++++++");
		for(Integer e: ubstanceInteger) {
			System.out.println(e);
		}
		
		
		
		
	}

}

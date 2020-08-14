package exam03;

import java.util.ArrayList;

public class AdvencedWrapperList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<Integer> ubstanceInteger = new ArrayList<Integer>();
		
//		ubstanceInteger.add(new Integer(10) );
		ubstanceInteger.add(10);      //AutoUnboxing
//		ubstanceInteger.add(new Integer(20) );
		ubstanceInteger.add(20);      //AutoUnboxing
//		ubstanceInteger.add(new Integer(30) );
		ubstanceInteger.add(30);      //AutoUnboxing
		
		
		for (int i = 0; i < ubstanceInteger.size(); i++) {
			System.out.println(ubstanceInteger.get(i));
		}
		
		ubstanceInteger.remove(2);
		
		
		System.out.println("____________________");
		
		
		for (int i = 0; i < ubstanceInteger.size(); i++) {
			System.out.println(ubstanceInteger.get(i));
		}
		
	}

}

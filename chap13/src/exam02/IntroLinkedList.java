package exam02;

import java.util.ArrayList;
import java.util.LinkedList;

//import org.omg.CORBA.INTERNAL;

public class IntroLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num1 = new Integer(10);
		Integer num2 = new Integer(20);
		Integer num3= new Integer(30);
		
		Integer[] numIntegers = new Integer[3];
		
		numIntegers[0] = new Integer(10); 
		numIntegers[1] = new Integer(20); 
		numIntegers[2] = new Integer(30); 
		
		
		LinkedList<Integer> ubstanceInteger = new LinkedList<Integer>();
		
		ubstanceInteger.add(new Integer(10) );
		ubstanceInteger.add(new Integer(20) );
		ubstanceInteger.add(new Integer(30) );
		
		for (int i = 0; i < ubstanceInteger.size(); i++) {
			System.out.println(ubstanceInteger.get(i));
		}
		
		ubstanceInteger.remove(2);
		
		
		System.out.println("++++++++++++++++");
		
		
		for (int i = 0; i < ubstanceInteger.size(); i++) {
			System.out.println(ubstanceInteger.get(i));
		}
		System.out.println("++++++++++++++++");
		
		for(Integer e: ubstanceInteger) {
			System.out.println(e);
		}
		
	}

}

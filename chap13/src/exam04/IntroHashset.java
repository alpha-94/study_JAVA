package exam04;

import java.util.HashSet;
import java.util.Iterator;

public class IntroHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<String>();
		
		
		set.add("ex1");
		set.add("ex2");
		set.add("ex3");
		set.add("ex4");
		set.add("ex2");
		
		System.out.println(set.size());
		//ex2 의 중복
		System.out.println("++++++++");
//		for (int i = 0; i < set.size(); i++) {
//			System.out.println(set.get(i));
//		}
		
		Iterator<String> itr = set.iterator();
		
		
		//데이터 참조 구문
		while (itr.hasNext()) {//hasNext - set.add 쪽으로 가서 데이터 있는지 확인
													//있으면 true 없으면 false
			System.out.println(itr.next());
			
			
			
		}
		System.out.println("++++++++");
		for(String e: set) {
			System.out.println(e);
		}
		

	}

}

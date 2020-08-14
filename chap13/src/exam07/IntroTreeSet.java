package exam07;

import java.util.TreeSet;

public class IntroTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("ex1");
		set.add("ex2");
		set.add("ex3");
		set.add("ex3");
		set.add("ex4");
		
		
		System.out.println(set.size());
		
		for (String e : set) {
			System.out.println(e);
		}

	}

}

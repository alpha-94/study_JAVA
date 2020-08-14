package exam05;

import java.util.HashSet;

class Num{
	int num;
	
	Num(int num){
		this.num = num;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(num);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		System.out.println("equals!");
		
		Num compNum = (Num) obj;
		if(compNum.num ==num) {
			return true;
		}else {
			return false;
		}

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("hash!");
		return num%3;
	}
	
	
	
}





public class HashSetEquals {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Num> set = new HashSet<Num>(); 
		
		set.add(new Num(10));
		set.add(new Num(20));
		set.add(new Num(10));
		set.add(new Num(30));
		set.add(new Num(40));
		set.add(new Num(20));
		
		for (Num e : set) {
			System.out.println(e);
		}
		
		

	}

}

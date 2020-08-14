package exam06;

import java.util.HashSet;

class Person{
	String nameString;
	int age;
	
	Person(String nameString, int age){
		this.age = age;
		this.nameString = nameString;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nameString + " : " + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person tmp = (Person) obj;
			return nameString.equals(tmp.nameString) && (age==tmp.age);
			
		}else {
			return false;
		}
		
		
//		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		
		return (nameString+age).hashCode();
	}
	
	
	
}

public class HashSetEquals2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Person> set = new HashSet<Person>();
		
		set.add(new Person("홍길동", 22));
		set.add(new Person("홍길동", 22));//중복 데이터 출력 X 
		set.add(new Person("홍길북", 27));
		set.add(new Person("홍길서", 22));
		set.add(new Person("홍길남", 22));
		
		for (Person e : set) {
			System.out.println(e);
		}
		

	}

}

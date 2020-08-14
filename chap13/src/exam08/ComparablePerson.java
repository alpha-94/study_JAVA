package exam08;

import java.util.TreeSet;

class Person implements Comparable<Person>{
	
	String nameString;
	int age;
	
	
	Person(String nameString, int age){
		this.age = age;
		this.nameString = nameString;
	}
	
	public void showData() {
		System.out.print("이름 : " + nameString);
		System.out.println("///나이 : " + age);
	}

	@Override
	public int compareTo(Person o) {
		//하드코딩
//		if (age > o.age) {
//			return 1;//크면 양수 아무값
//		}else if (age==o.age) {
//			return 0;//같으면 ZREO
//		}else {
//			return -1;	//작으면 음수 아무값
//		}
		return age - o.age;
		//즉 두 값의 차로 양 음 ZERO 리턴 !!
		
	}
	
	
	
	
	
}



public class ComparablePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Person> set = new TreeSet<Person>();
		
		set.add(new Person("wx", 21));
		set.add(new Person("xy", 30));
		set.add(new Person("ab", 28));
		set.add(new Person("cd", 80));
		set.add(new Person("ef", 25));//중복 데이터
		set.add(new Person("ef", 25));//중복 데이터
		
		for (Person e : set) {
			e.showData();
		}
		
		

	}

}

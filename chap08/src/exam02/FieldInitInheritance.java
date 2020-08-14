package exam02;

import exam02.protect.FatherClass;

class ChildClass extends FatherClass{
	
	ChildClass(int n1,int n2,int n3,int n4){
		super(n1,n2,n3,n4);
		
		
	}
	public void  Info(){
		//System.out.println(num1);	//	private 선언했으므로 접근 불가
		//System.out.println(num2);	//	디폴트값 또한 접근 불가
		System.out.println(num3);	//	protected 는 접근 ㅇ 
		System.out.println(num4);	//	당연히 public 은 접근 ㅇ 
		
	}
	
}

public class FieldInitInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass child = new ChildClass(1,2,3,4);
		
		System.out.println(child);
		
	}

}

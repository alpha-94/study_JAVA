package exam05;

interface SimpleInterface{
	
	
	public void showYourName();
	
}

class UpperClass{
	public void showYourAncestor() {
		System.out.println("UpperClass");
	}
}

class AAA extends UpperClass implements SimpleInterface{

	@Override
	public void showYourName() {
	System.out.println("Class AAA");	
	}
}

class BBB  implements SimpleInterface{
//extends UpperClass 생략
	@Override
	public void showYourName() {
	System.out.println("Class BBB");	
	}
}

class CCC extends UpperClass {
	CCC(){
	System.out.println("Class CCC");	
	}
}


public class BoundedTypeParam {

	public static void main(String[] args) {

		AAA aaa = new AAA();
		BBB bbb = new BBB();
		CCC ccc = new CCC();
		
		showInstanceAncestor(aaa);
		showInstanceAncestor(bbb);
		showInstanceName(ccc);
		
		
		
		
		
	}
	public static<T extends SimpleInterface> void showInstanceAncestor(T param) {
	//제너릭 설정 시 상속은 인터페이스 포함하여 extends 사용
		param.showYourName();
	
		
	}
	
	public static<T extends UpperClass> void showInstanceName(T param) {
		//제너릭 설정 시 상속은 인터페이스 포함하여 extends 사용
			param.showYourAncestor();
		
			
		}
	
	
}

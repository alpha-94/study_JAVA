package exam01;

class Myname {
	String name;
	
	Myname(String name){
		this.name = name;
		
	}
	//생성자 호출 방법
	//this();
	//상속간 하위클래스 생성자 내부 super(); 

	@Override
	protected void finalize() throws Throwable {//상속개념 조건하 호출 가능
		// TODO Auto-generated method stub
		super.finalize();//부모의 시작위치로 
		System.out.println(name+"이/가 소멸되었습니다.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	

}

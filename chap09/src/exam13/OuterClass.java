package exam13;

class OuterClass {
	private String myName;
	private int num;
	InnerClass innerClass;
	
	OuterClass(String name){
		myName = name;
		num = 0;
		innerClass = new InnerClass();
		
	}
	
	public void whoAreYou() {
		num++;
		System.out.println(myName + "OuterClass" + num);
	}
	
	class InnerClass{
		InnerClass(){
			whoAreYou();//외부 클래스 메서드 사용 가능
		}
		
	}

}

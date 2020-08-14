package exam12;

class OuterClassOne {
	
//	OuterClassOne(){//생성자
		NestedClass nst; //= new NestedClass();
//		nst.simpleMethod();
//	}
		OuterClassOne(){
			NestedClass nst= new NestedClass();
			nst.simpleMethod();
			whoAreYou();
		}



public void whoAreYou() {//메모리가 할당 되어있음.
	System.out.println("whoAreYou() 호출...");
	nst.simpleMethod();
//	simpleMethod(); 참조변수로만 호출 가능
	}

static class NestedClass{//안에 클래스를 만든다고 해도 메모리 할당되는건 아니기 때문에 인스턴스화는 해야함.
	NestedClass(){
		simpleMethod();
//		whoAreYou(); error 
	}
	public void simpleMethod() {
		System.out.println("");
	}
	
}//왜 굳이 클래스 안에 클래스를 만들까의 이유 : 의존의 의미도 있지만 독립으로도 쓸 수 있다
//OuterClassOne$NestedClass.class 형태로 저장 !


}
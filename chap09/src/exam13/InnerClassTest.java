package exam13;

public class InnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterClass outer1 = new OuterClass("First");
		OuterClass outer2 = new OuterClass("Second");
		
		outer1.whoAreYou();
		
		OuterClass.InnerClass inner1 = outer1.new InnerClass();
		OuterClass.InnerClass inner2 = outer1.new InnerClass();
		
		OuterClass.InnerClass inner3 = outer2.new InnerClass();
		OuterClass.InnerClass inner4 = outer2.new InnerClass();
		
		//static 이 안붙은 경우 인스턴스 방법
		
		
	}

}

package exam12;

public class NestedClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClassOne one = new OuterClassOne();
		one.whoAreYou();
//		one.simpleMethod(); error
		one.nst.simpleMethod();
		
		OuterClassOne.NestedClass nst1 = 
		new OuterClassOne.NestedClass();
	
		OuterClassTwo two = new OuterClassTwo();
//		two.nst.simpleMethod();
//		
//		OuterClassTwo.NestedClass nst2 = new OuterClassTwo.NestedClass();
//		error 사유 : private , not visible
		
	}

}

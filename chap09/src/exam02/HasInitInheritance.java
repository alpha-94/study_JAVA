package exam02;

public class HasInitInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Police police1 = new Police(5,3);
		
		police1.shut();
		police1.putHandcuff();
		
		Police police2 = new Police(0,3);
		
		police2.shut();//논리적 모순
		police2.putHandcuff();
		
		
		
		
	}

}

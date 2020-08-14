package exam01;

public class ObjectFinalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("START");
		
		Myname obj1 = new Myname("인스턴스1");
		
		obj1 = null; // Myname 주소값 초기화
		
		System.gc();
		System.runFinalization();
		System.out.println("END");


		
	}

}

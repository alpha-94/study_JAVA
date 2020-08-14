package exam05;

public class UseWrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		int num = 5;
		Integer integer = new Integer(5);
		
		showData(name);
		showData(num);//Autoboxing !!!!
		showData(integer);
		
	}
	
	public static void showData(Object obj) {
		System.out.println(obj);// num Autounboxing!!!
	}

}

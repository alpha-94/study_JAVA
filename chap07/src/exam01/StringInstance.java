package exam01;

public class StringInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "홍길동";
		String hello = new String("안녕    하십니까");//문자6 + 블랭크 4
		String name1 =new String("세종");
		String name2 =new String("세종");
		// name1 주소 할당, name 2 주소 할당
		
		
		System.out.println("Wls".length());
		
		System.out.println(name.length());
		System.out.println(hello.length());
		
		if(name1 == name2) {
			System.out.println("동일 instance");
		}else {
			System.out.println("다름 instance");
		}
		
		String name3 = "이순신";
		String name4 = "이순신";
		// "이순신" 주소 할당(Heap)
		

		if(name3 == name4) {
			System.out.println("동일 instance");
		}else {
			System.out.println("다름 instance");
		}
		
		
	}

}

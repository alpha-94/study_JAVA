package exam05;

public class StringBuilder {

	public static void main(String[] args) {
		StringBuffer StringBuilder=new StringBuffer("AD");
		
		System.out.println(StringBuilder);
		
//		StringBuilder.append(25);
//		StringBuilder.append('Y');
//		StringBuilder.append(true);
//		StringBuilder.append(44.4);
		
		StringBuilder.append(25).append('Y').append(true).append(44.4);
		
		System.out.println(StringBuilder);
		
		StringBuilder.insert(2, false);
		System.out.println(StringBuilder);

	}
// 두가지 자료형은 스레드 공부 한 다음에 ㅇㅇ 
}

package exam02;

public class SystemOutPrintln {
	public static void main(String[]args) {
		System.out.println(100); //주석쓰, 정수출력
		System.out.println(88.888);//실수 출력
		////////////여백띠////////////
		////////////여백띠////////////

		// ♠♤♠♤♠♤♠♤사칙연산 결과 출력 ♠♤♠♤♠♤♠♤
		System.out.println(100+35);
		System.out.println(100-35);
		System.out.println(100/35); // 2만 결과 출력 봤을땐 정수만 출력 되는듯 ㅋ
		System.out.println(100*35);
		
		System.out.println("100+35");//""문자열 인식 ㅎ
		System.out.println("Hello"+",,,,"+"Java!!");//문자 더하기
		System.out.println(3.14+"는 실수입니다");		//결국 정수도 ""의 형태로
																		//받아들여짐
		System.out.println("100*35 =" + (100*35));
		
		
		
	}

}

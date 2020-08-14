package exam08;

public class CastingOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alphabet = 'A';
		//short unicode ; error
		int unicode;
		
		unicode = alphabet;
		
		System.out.println(alphabet);
		System.out.println(unicode);
		
		
		//byte → short (음수 양수)  → int → long → float → double
		//          char(데이터 표현) ↗
		double num = 23.5;
		
		
		int score = (int)num; //자료형 더블이기 때문에 의도적으로 int 씌어주기
		System.out.println(score);// 소숫점 버림 ㅇ 
		
		//int sum = (int)0.5+10; // int 안씌우면 더블 되기때문에 씌어야함 ㅇ 
		
		float result = (float)(0.5+10);
		System.out.println(result);
		
		
		
		
	}

}

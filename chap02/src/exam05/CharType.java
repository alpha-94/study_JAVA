package exam05;

public class CharType {

	public static void main(String[] args) {
		
		char alphbet, hangeul;
		int unicode;
		
		alphbet = 'A';
		unicode = alphbet;
		System.out.println(alphbet);
		System.out.println(unicode);
		
		
		hangeul = '한';
		unicode = hangeul;
		System.out.println(hangeul);
		System.out.println(unicode);
		
		
		hangeul = '국';
		unicode = hangeul;
		System.out.println(hangeul);
		System.out.println(unicode);
		
//		hangeul = 'ㄱㄴ';
//		unicode = hangeul;
//		System.out.println(hangeul);
//		System.out.println(unicode);
		
		String name = "ㄱㄴㄷㄹ";
		System.out.println(name);
		
//		unicode = name; 는 에라다
		
		
		

	}

}

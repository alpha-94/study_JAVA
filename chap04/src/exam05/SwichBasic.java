package exam05;

public class SwichBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//정수형 switch
		int num =1 ;
		
		switch(num) {
		case 1:
			System.out.println("정수값은 1이래");
			System.out.println("아침");
			break;
			
		case 2:
			System.out.println("정수값은 2래");
			System.out.println("점심");
			break;

		case 3:
			System.out.println("정수값은 3이래");
			System.out.println("저녁");
			break;
			
		default:
			System.out.println("1~3 이외의 값이래");
			System.out.println("뭘 넣었길래 제발 생각하고 값넣어 주길 바라");	
			break;
			
		}
		
		System.out.println("ㅃ2");
		
		
		//문자형 switch
		String name = "홍길동";
		//문자형 스위치문은 7버전 이후 가능
		switch(name) {
		case "김유신":
			System.out.println("YOUR NAME IS " +name);
			break;
			
		case "세종대왕":
			System.out.println("YOUR NAME IS " +name);
			break;
			
		case "홍길동":
			System.out.println("YOUR NAME IS " +name);
			break;
			
		default:
			System.out.println("못찾누");
			break;
	}

	}
}

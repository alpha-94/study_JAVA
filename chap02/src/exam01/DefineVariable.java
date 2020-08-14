package exam01;

public class DefineVariable {
	public static void main(String[] args) {
		/*
 			5489 + 9527 =? 
 			System.out.println(5489 + 9527);
			변수 적용 ㅇㅇ 
		 
		 */		
		
		// ♠♤♠♤♠♤♠♤ 변수를 선-언한다( 메모리 할당 요청 ) ♠♤♠♤♠♤♠♤
		int data1; 
		int data2;
		
		
		data1 = 5489;
		data2 = 9527;
		
		System.out.println("LET'S DATA ADDITION__ver1");
		

		System.out.println("data1 is "+data1);
		System.out.println("data2 is "+data2);
	
		System.out.println("data1+data2 ="+(data1 + data2));

		
		
		//~~~~~~~~~~~~~컴파일용 띄어쓰기~~~~~~~~~~~~~
		System.out.println("        ....        ");
		System.out.println("        ....        ");
		System.out.println("        ....        ");
		System.out.println("        ....        ");
		//~~~~~~~~~~~~~컴파일용 띄어쓰기~~~~~~~~~~~~~

		
		// ♠♤♠♤♠♤♠♤ OR ! ♠♤♠♤♠♤♠♤
		
		int result;
		result = data1 + data2;
		
		System.out.println("LET'S DATA ADDITION__ver2");
		

		System.out.println("data1 is "+data1);
		System.out.println("data2 is "+data2);
	
		System.out.println("data1+data2 = result = "+result);

		
		//~~~~~~~~~~~~~컴파일용 띄어쓰기~~~~~~~~~~~~~		
		System.out.println("        ....        ");
		System.out.println("        ....        ");
		System.out.println("        ....        ");
		System.out.println("        ....        ");
		//~~~~~~~~~~~~~컴파일용 띄어쓰기~~~~~~~~~~~~~
		

		
		// ♠♤♠♤♠♤♠♤ data1 데이터 변경해보깅 ♠♤♠♤♠♤♠♤
		System.out.println("LET'S DATA EDIT__");
		System.out.println("DATA1 5489→6000");
		data1 = 6000;
		System.out.println("data1 is "+data1);
		
		/* ------------------변수이름 짓기 규칙------------------
		 * 문자 숫자 한글 사용 가능 
		 * 대소문자 구별 길이 제한없음 
		 * 예약어 사용 금지 숫자로 시작하면 안됨 
		 * 특수문자는 '_' "$' 이것만 됨
		 * 공백 포함 X
		 * ---권고사항----
		 * 모두 대문자 피하기
		 * 생략형 피하기
		 * 카멜 / 파스칼 / 헝가리언 표기법 사용 권장
		 * employeeNumber -- 카멜
		 * employee_num -- 파스칼
		 * intEmployeeNum -- 헝가리언
		 */
		}

}

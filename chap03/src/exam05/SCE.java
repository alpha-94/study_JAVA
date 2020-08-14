package exam05;

public class SCE {//숏트 서킷 이벨류에이션

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int num1  , num2; 이렇게 쓰면 빈값으로 사용 못함 그래서 
		//정수는 =0 실수는 =0.0 논리는 flase 초기값을 넣어줘야 함
		int num1 =0 , num2 =0;
		boolean result = false;
		
		//System.out.println(num1);
		
		result = ((num1 += 10)<0) && ((num2 +=10)>0) ;
		// AND 연산자 쓸 때
		//앞 값이 F 면 뒷값은 실행 안하고 F 도출     ↑결국 이부분은 퍼포먼스를 안함
		System.out.println("결과 : " + result);
		System.out.println("num1 : " + num1); // 10
		System.out.println("num2 : " + num2); // 0
		
		result = ((num1 += 10) > 0) || ((num2 +=10) < 0) ;
		// OR 연산자를 쓸 때
		//앞 값이 T 면 뒷값은 실행 안하고 T 도출     ↑결국 이부분은 퍼포먼스를 안함
		System.out.println("결과 : " + result);
		System.out.println("num1 : " + num1); 
		System.out.println("num2 : " + num2); 
		
		
		System.out.println("실습");
		
		
		/////////////////////////////////////////////////////////////////////////
		num1 = 0;
		num2 = 0;
		result = false;
		
		result = ((num1 += 10)<0) && ((num2 +=10)>0) ;
		if(result==true) {
			
			
			System.out.println("결과 : " + result);
			System.out.println("num1 : " + num1); // 0
			System.out.println("num2 : " + num2); // 0
		}else {
			
			if((num2<10)==true) {
				num2 +=10;
				
			}
			System.out.println("결과 : " + result);
			System.out.println("num1 : " + num1); // 0
			System.out.println("num2 : " + num2); // 0
		}
		
		result = ((num1 += 10) > 0) || ((num2 +=10) < 0) ;
		if(result==false) {
			
			System.out.println("결과 : " + result);
			System.out.println("num1 : " + num1); // 0
			System.out.println("num2 : " + num2); // 0
		}else {
			
			if((num2<=10)==true) {
				num2+=10;	
				
			}
				
			System.out.println("결과 : " + result);
			System.out.println("num1 : " + num1); // 0
			System.out.println("num2 : " + num2); // 0
		}
		
		
		
	}

}

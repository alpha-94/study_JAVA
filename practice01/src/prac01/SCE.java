package prac01;

public class SCE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 =0 , num2 =0;
		boolean result = false;
	
		
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

package exam11;

public class LoopBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("*1~100 사이의 (양의) 짝수를 출력*");

		for(int i = 1 ; i<=100; i++) {
			
			if(i%2==0) {
				System.out.println(i);	
				
			}
			

			
		}
		
		System.out.println("*1~100 사이의 (양의) 5의 배수 출력*");
		
		for(int i = 1 ; i<=100; i++) {
			
			if(i%5==0) {
				
				System.out.println(i);	

				
			}
			
		}
		
		System.out.println("*1~100 사이의 (양의) 5의 배수 이면서 7의 배수 출력*");
		
		for(int i = 1 ; i<=100; i++) {
			
			
				if((i%7==0)&&(i%5==0)) {
				
				
					System.out.println(i);	
				
			}
			
			
			
		}
		
		System.out.println("*1~100 사이의 (양의) 5의 배수 이면서 7의 배수 첫 정수만 출력*");
		
		
		
		
		for(int i = 1 ; i<=100; i++) {
			
			
			if((i%7==0)&&(i%5==0)) {
			
			
				System.out.println(i);	
			break;
		}
		
		
		
	}
		System.out.println("*1~100 ");
		
		int brk = 0;
		
			for(int i = 1 ; i<=100; i++) {
						
						if((i%7==0)&&(i%2==0)) {
							if(brk<2) {
								brk++;
							System.out.println(i);	
								
							}
								}
		
						
				
						
		} 
		
		
		
	
	}
	}


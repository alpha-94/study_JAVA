package exam03;

public class If_Elseif_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int birth = 1992;
		
		int age = 0;
		
		age = 2020 - birth +1;
		
		System.out.println("당신의 나이는 " + age + "세 입니다");
		
		System.out.println("당신은.....");
		
		if(age<10) {
			System.out.println("10대 미만입니다.");
			
		}else if(age < 20) { //"10대 이상입니다."
				System.out.println("10대 입니다.");
				
		}else if (age<30) {
				System.out.println("20대 입니다....젊으시네요 ^^");
		}else {
				System.out.println("30대 이상입니다.");
			
		}
		}
		
		
		
	}



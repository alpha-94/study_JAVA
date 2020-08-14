package prac01;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		Random random = new Random();
		int a[] =new int[10];

		random.setSeed(System.currentTimeMillis());
		
		for (int i = 0; i < 6 ; i++) {
				a[i]= random.nextInt(44)+1;
				for (int j = 0; j < i; j++) {
					if(a[i]==a[j]) {
						i--;
					}
				}
//				System.out.println(random.nextInt(44)+1);
		}
		for (int b = 0; b < 6; b++) {
			System.out.println(a[b]);
		}
		
		
	}

}

class Lprogram{
	
	Random random = new Random();
	int a[] ;
	
	Lprogram(){
	}
	
	
	public void randomForLotto() {
		// TODO Auto-generated method stub
		random.setSeed(System.currentTimeMillis());
	
		for (int i = 0; i < 6 ; i++) {
				a[i]= random.nextInt(44)+1;
				for (int j = 0; j < i; j++) {
					if(a[i]==a[j]) {
						i--;
					}
				}
//				System.out.println(random.nextInt(44)+1);
		}
		for (int b = 0; b < 6; b++) {
			System.out.println(a[b]);
		}
		
		
	}
	
	
	
	
}

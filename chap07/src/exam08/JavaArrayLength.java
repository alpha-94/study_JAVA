package exam08;

public class JavaArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int[] age = new int[3] {20,21,22};
		int[] age = new int[] {20,21,22,44,44,88,25,11,33,44};
		
//		age[1] = 20;
//		age[2] = 21;
//		age[3] = 22;
		
		
		for(int i =0 ; i<age.length ; i++) {
			System.out.println("나이 : " + age[i]);
		}
		
		
	}

}

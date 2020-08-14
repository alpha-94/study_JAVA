package exam13;

public class EnhancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3,4,5};
		int sum = 0;
		
		for(int e : arr ) { 					//echancedfor
			System.out.println("e = " + e);
			sum += e;
			
		}
		System.out.println("합 = " +sum);
		
		
		for(int e : arr) {
			e++;
			System.out.print(e + " ");
		}
		
		System.out.println();
		
		for(int e : arr) {
			
			System.out.print(e + " ");
		}
		
	}

}

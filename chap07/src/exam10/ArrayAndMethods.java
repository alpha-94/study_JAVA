package exam10;


public class ArrayAndMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int [] arr = new int [] {1,2,3,4,5};
		int [] arr = {1,2,3,4,5};
		int num = 10;
		int [] ref;//참조변수선언
		
		ref = addAllArray(arr, num);
		
		for(int i = 0;i <ref.length;i++) {
			System.out.println("arr : "+ref[i]);
		}
	}

	public static int[] addAllArray(int[] a, int n){
		n = 20;
		
		for(int i = 0 ; i < a.length ; i ++) {
			a[i] += 10;
			
		}
		System.out.println(n);
		for(int i = 0 ; i < a.length ; i ++) {
			System.out.println(a[i]);
		}
		return a;
		
	}
	
}

package exam12;

public class RaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] arr = {
				{0,1,2,3},
				{4,5,6,7},
				{8,9,10,11}
				};
		
for(int i = 0;i < 3; i++) {
			
			for(int j =0;j < 4; j++) {
				System.out.println("["+ i +"]"+"["+j+"]"+"="+ arr[i][j] );	
			}
		}
		
	}

}

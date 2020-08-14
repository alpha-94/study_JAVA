package exam11;

public class TwoDimenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr = new int[4][4];//전형적인 행 열
		
		arr[0][0]=0;
		arr[0][1]=1;
		arr[0][2]=2;
		arr[0][3]=3;
		
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		arr[1][3]=7;
		
		arr[2][0]=8;
		arr[2][1]=9;
		arr[2][2]=10;
		arr[2][3]=11;
		
		arr[3][0]=12;
		arr[3][1]=13;
		arr[3][2]=14;
		arr[3][3]=15;
		
		
		System.out.println("행 : " + arr.length);
		System.out.println("1행 : " + arr[0].length);
		System.out.println("2행 : " + arr[1].length);
		System.out.println("3행 : " + arr[2].length);
		
		for(int i = 0;i < 4; i++) {
			
			for(int j =0;j < 4; j++) {
				System.out.println("["+ i +"]"+"["+j+"]"+"="+ arr[i][j] );	
			}
		}
		
		
		
		//ex
		//00  01  02  03
		//10  11  12  13
		//20  21  22  23
		//30  31  32  33

		
		
		
	}

}

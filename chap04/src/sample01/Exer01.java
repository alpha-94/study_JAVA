package sample01;

public class Exer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------원본-------");
		int n = 24;
		
		if(n>=0 && n <10) 
		
			System.out.println("output N: 0~9  --" + "ANSWER  N:" + n);


			else if(10>=0 && n <20)

				System.out.println("output N: 10~19  --"+ "ANSWER  N:" + n);

			else if(20>=0 && n <30)

				System.out.println("output N: 20~29  --"+ "ANSWER  N:" + n);

		
		else

			System.out.println("output N : - or 30~  --"+ "ANSWER  N:" + n);

		
		
		
		System.out.println("-------스위치1-------");
		
		
		int k = 24;
		
		switch(k){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println("output K : 0~9");
				System.out.println("ANSWER K:  " + k);
				break;
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
				System.out.println("output K : 10~19");
				System.out.println("ANSWER K:  " + k);
				break;
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
				System.out.println("output K : 20~29");
				System.out.println("ANSWER K:  " + k);
				break;
			case 30:
				System.out.println("output K : - or 30~");
				System.out.println("ANSWER K:  " + k);
				break;
				
				
		}
		
		
		System.out.println("-------스위치2-------");
		int t = 24;
		
		switch(t/10) {
		
			case 0:
				System.out.println("output T : 0~9");
				System.out.println("ANSWER K:  " + t);
				break;
				
				
			case 1:
				System.out.println("output T : 10~19");
				System.out.println("ANSWER K:  " + t);
				break;
				
				
			case 2:
				System.out.println("output T : 20~29");
				System.out.println("ANSWER K:  " + t);
				break;
				
				
			case 3:
				System.out.println("output T : - or 30~");
				System.out.println("ANSWER K:  " + t);
				break;
				
		}
		
		
		System.out.println("OUT");
		
	}

}


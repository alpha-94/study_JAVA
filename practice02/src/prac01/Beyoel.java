package prac01;

class Search{
	private int a1, a2, a3, a4, a5, a6,  a7, a8, a9, a10, a11, a12, a13, a14, a15;
	
		Search(){
		this.a1 = 17;
		this.a2 = 53;
		this.a3 = 84;
		this.a4 = 73;
		this.a5 = 49;
		this.a6 = 27;
		this.a7 = 90;
		this.a8 = 85;
		this.a9 = 75;
		this.a10 = 50;
		this.a11 = 85;
		this.a12 = 92;
		this.a13 = 78;
		this.a14 = 98;
		this.a15 = 68;
	}
	
	public void max() {
		int result = 0;
		result = (a1 > a2) ?  a1 : a2;
		result = (result > a3) ? result : a3;
		result = (result > a4) ? result : a4;
		result = (result > a5) ? result : a5;
		result = (result > a6) ? result : a6;
		result = (result > a7) ? result : a7;
		result = (result > a8) ? result : a8;
		result = (result > a9) ? result : a9;
		result = (result > a10) ? result : a10;
		result = (result > a11) ? result : a11;
		result = (result > a12) ? result : a12;
		result = (result > a13) ? result : a13;
		result = (result > a14) ? result : a14;
		result = (result > a15) ? result : a15;
		
		System.out.println("최소값 : " + result);
	}
	
	public void min() {
		int result = 0;
		result = (a1 < a2) ?  a1 : a2;
		result = (result < a3) ? result : a3;
		result = (result < a4) ? result : a4;
		result = (result < a5) ? result : a5;
		result = (result < a6) ? result : a6;
		result = (result < a7) ? result : a7;
		result = (result < a8) ? result : a8;
		result = (result < a9) ? result : a9;
		result = (result < a10) ? result : a10;
		result = (result < a11) ? result : a11;
		result = (result < a12) ? result : a12;
		result = (result < a13) ? result : a13;
		result = (result < a14) ? result : a14;
		result = (result < a15) ? result : a15;
		
		System.out.println("최소값 : " + result);
	}
	public void avg() {
		double result = 0;
		result = (a1 + a2 + a3 + a4+ a5 + a6 + a7 + a8 +a9 + a10 + a11 + a12 + a13+ a14+ a15) / 15;
		
		System.out.println("평균값 : " + result);
	}
}


	

public class Beyoel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Search second = new Search();
		
		
		
		second.max();
		second.min();
		second.avg();
	}

}

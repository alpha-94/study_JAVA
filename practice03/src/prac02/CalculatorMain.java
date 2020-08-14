package prac02;

class Add{
	int Cntadd;
	
	Add(){
		Cntadd=0;
			}
	//오버로딩
	
	public double AddtoNum(double n1, double n2){
		Cntadd++;
		return  n1 + n2;
		
	}
	
	public double AddtoNum(int n1, double n2){
		Cntadd++;
		return  n1 + n2;
		
	}
	
	public double AddtoNum(double n1, int n2){
		Cntadd++;
		return  n1 + n2;
		
	}
	
	public int AddtoNum(int n1, int n2){
		Cntadd++;
		return  n1 + n2;
		
	}
	
	int getCntadd() {
		return Cntadd;
	}
	
}

class Sub{
	int Cntsub;
	
	Sub(){
		Cntsub=0;
	}
	
	public double SubtoNum(double n1, double n2){
		Cntsub++;
		return  n1 - n2;
		
	}
	
	public double SubtoNum(int n1, double n2){
		Cntsub++;
		return  n1 - n2;
		
	}
	
	public double SubtoNum(double n1, int n2){
		Cntsub++;
		return  n1 - n2;
		
	}
	
	public int SubtoNum(int n1, int n2){
		Cntsub++;
		return  n1 - n2;
		
	}
	
	int getCntsub() {
		return Cntsub;
	}
	
	
}

class Multy{
	int Cntmulty;
	
	Multy(){
		Cntmulty =0;
	}
	
		public double MultytoNum(double n1, double n2){
		Cntmulty++;
		return n1 * n2;
			
		}
		
		public double MultytoNum(int n1, double n2){
			Cntmulty++;
			return n1 * n2;
			
		}
		
		public double MultytoNum(double n1, int n2){
			Cntmulty++;
			return n1 * n2;
			
		}
		
		public int MultytoNum(int n1, int n2){
			Cntmulty++;
			return n1 * n2;
			
		}
		int getCntmulty() {
			return Cntmulty;
		}
	
	
}

class Vid{
int Cntvid;
	
	Vid(){
		Cntvid =0;
	}
	
		public double VidtoNum(double n1, double n2){
			Cntvid++;
		return n1 / n2;
			
		}
		
		public double VidtoNum(int n1, double n2){
			Cntvid++;
			return n1 / n2;
			
		}
		
		public double VidtoNum(double n1, int n2){
			Cntvid++;
			return n1 / n2;
			
		}
		
		public int VidtoNum(int n1, int n2){

			Cntvid++;
			
			return n1 / n2;
			
	}
		
		int getCntvid() {
			return Cntvid;
		}
}

class Remain{
int Cntremain;
	
	Remain(){
		Cntremain =0;
	}
	
		public double RemaintoNum(double n1, double n2){
			Cntremain++;
		return n1 % n2;
			
		}
		
		public double RemaintoNum(int n1, double n2){
			Cntremain++;
			return n1 % n2;
			
		}
		
		public double RemaintoNum(double n1, int n2){
			Cntremain++;
			return n1 % n2;
			
		}
		
		public int RemaintoNum(int n1, int n2){
			Cntremain++;
			return n1 % n2;
}
		
		int getCntremain() {
			return Cntremain;
		}
	
}


class Calculate{
	Add adder;
	Sub sub;
	Multy multy;
	Vid vid ;
	Remain remain;
	
	Calculate(){
	adder = new Add();
	sub = new Sub();
	multy = new Multy();
	vid = new Vid();
	remain = new Remain();
	}
	//////덧셈 오버로드//////
	public int AddNum(int n1, int n2) {
		return adder.AddtoNum(n1, n2);
	}
	public double AddNum(double n1, int n2) {
		return adder.AddtoNum(n1, n2);
	}
	public double AddNum(int n1, double n2) {
		return adder.AddtoNum(n1, n2);
	}
	public double AddNum(double n1, double n2) {
		return adder.AddtoNum(n1, n2);
	}
	
//////뺄셈 오버로드//////
	public int SubNum(int n1, int n2) {
		return sub.SubtoNum(n1, n2);
	}
	public double SubNum(double n1, int n2) {
		return sub.SubtoNum(n1, n2);
	}
	public double SubNum(int n1, double n2) {
		return sub.SubtoNum(n1, n2);
	}
	public double SubNum(double n1, double n2) {
		return sub.SubtoNum(n1, n2);
	}
	////////곱셈 오버로드//////
	public int MultyNum(int n1, int n2) {
		return multy.MultytoNum(n1, n2);
	}
	public double MultyNum(double n1, int n2) {
		return multy.MultytoNum(n1, n2);
	}
	public double MultyNum(int n1, double n2) {
		return multy.MultytoNum(n1, n2);
	}
	public double MultyNum(double n1, double n2) {
		return multy.MultytoNum(n1, n2);
	}
	//////나눗셈 오버로드////////
	public int VidNum(int n1, int n2) {
		return vid.VidtoNum(n1, n2);
		
	}
	public double VidNum(double n1, int n2) {
		return vid.VidtoNum(n1, n2);
	}
	public double VidNum(int n1, double n2) {
		return vid.VidtoNum(n1, n2);
	}
	public double VidNum(double n1, double n2) {
		return vid.VidtoNum(n1, n2);
	}
	////나머지 오버로드/////
	public int RemainNum(int n1, int n2) {
		return remain.RemaintoNum(n1, n2);
	}
	public double RemainNum(double n1, int n2) {
		return remain.RemaintoNum(n1, n2);
	}
	public double RemainNum(int n1, double n2) {
		return remain.RemaintoNum(n1, n2);
	}
	public double RemainNum(double n1, double n2) {
		return remain.RemaintoNum(n1, n2);
	}
	
	public void showOperationTimes() {
		System.out.println("덧셈 횟수 : " + adder.getCntadd());
		System.out.println("뺄셈 횟수 : " + sub.getCntsub());
		System.out.println("곱셈 횟수 : " + multy.getCntmulty());
		System.out.println("나눗셈 횟수 : " + vid.getCntvid());
		System.out.println("나머지 횟수 : " + remain.getCntremain());
	}
	
	
	
	
	
}

public class CalculatorMain {
	public static void main(String[] args) {
		Calculate calc = new Calculate();
		
		System.out.printf("덧셈 : 345 + 417.14  ::  %s" , calc.AddNum(345, 417.14));
		System.out.printf("뺄셈 : 25859.7142 - 345  :: %s ", calc.SubNum(25859.7142, 345));
		System.out.printf("곱셈 : 487 * 25  ::  %s",calc.MultyNum(487, 25));
		System.out.printf("나눗셈 : 345.25 / 12  :: %s ",calc.VidNum(245.25, 12));
		System.out.println("나머지 : 412 % 4  ::  "+calc.RemainNum(412, 4));
		
		
		calc.showOperationTimes();
		
		
		
	}
	

}

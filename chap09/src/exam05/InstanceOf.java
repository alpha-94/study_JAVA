package exam05;

class Computer{
	Computer(){
		
		
		}
	public void computerMethod() {
		System.out.println("컴퓨터 자료형 호출");
	}
}

class Notebook extends Computer{
	Notebook(){
		super();
	}
	public void notebookMethod() {
		System.out.println("노트북 자료형 호출");
	}
	
}

class TabletPC extends Notebook{
	TabletPC(){
		super();
	}
	public void tabletPCMethod() {
		System.out.println("테블릿PC 자료형 호출");
	}
}


public class InstanceOf {
	public static void main(String[] args) {//스테틱은 먼저 메모리에 올라온다
		// TODO Auto-generated method stub
		Computer computer = new Computer();
		Notebook notebook = new Notebook();
		TabletPC tabletPC = new TabletPC();
		
		
		useComputer(computer);//컴퓨터 주소 호출
		useComputer(notebook);//노트북 주소 호출
		useComputer(tabletPC);//테블릿 주소 호출
		
	}
	
																	//Computer comp = computer;
																	//Computer comp = notebook;
																	//Computer comp = tabletPC;
	public static void useComputer(Computer comp) {//컴퓨터 참조자료형 선언
		
		comp.computerMethod();
		//comp.notebookMethod(); //자료형이 Computer 이기 때문에 사용 불가능
		//comp.tabletPCMethod(); //자료형이 Computer 이기 때문에 사용 불가능
		//결국 instance of 를 사용해야함!!!!! 오버로딩이 필요가 없으시다
		//참조변수instanceof자료형 => booln값으로 변환 참조변수에게 자료형 아는지 확인
		
		 if(comp instanceof TabletPC) {//가장 하위 클래스 부터 비교 하기 (상위클래스로 하게되면 항상 true가 나오기때문)
			//TabletPC tabletPC =  (TabletPC)comp;  //강제형변환
			 comp = (TabletPC)comp; //강제형변환
			//tabletPC.tabletPCMethod();
			 //tabletPC.notebookMethod();
			 //tabletPC.computerMethod();
			 ((TabletPC) comp).tabletPCMethod();
			 ((TabletPC) comp).notebookMethod();
			 
			 
		 }
		 else if(comp instanceof Notebook) {
			 Notebook notebook =  (Notebook)comp; 
			 notebook.notebookMethod();
			 notebook.computerMethod();
			 
		 }
		 else {
			 comp.computerMethod();
		 }
		
		
		
	}//소멸
//	
//	public static void useComputer(Notebook comp) {
//		comp.computerMethod();//상속으로 인한 호출
//		comp.notebookMethod();//자신 메서드 호출 
//		
//	}//소멸
//	
//	public static void useComputer(TabletPC comp) {
//		comp.computerMethod();//상속으로 인한 호출
//		comp.notebookMethod();//상속으로 인한 호출
//		comp.tabletPCMethod();//자신 메서드 호출 
//	}//소멸
}

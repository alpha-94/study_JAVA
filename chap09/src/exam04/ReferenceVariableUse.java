package exam04;

class Computer{
	
}

class Notebook extends Computer{
	Notebook(){
		super();
	}
	
}

class TabletPC extends Notebook{
	TabletPC(){
		super();
	}
	
}

public class ReferenceVariableUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notebook notebook = new Notebook();
		
		
		Computer computer1 = new Notebook();
		Computer computer2 = new TabletPC();
		Notebook notebook2 = new TabletPC();
//		TabletPC tabletPC = new Notebook();
		
		TabletPC tabletPC1 = new TabletPC();
		TabletPC tabletPC2 = tabletPC1;
		
		Notebook notebook3 = tabletPC2;
		
		Computer computer3 = tabletPC2;
		
//		TabletPC tabletPC3 = notebook3;
		
//		TabletPC tabletPC4= computer3;
		
		
		

	}

}

package exam04;

class FatherClass{

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "class FatherClass";
	}
	
	
	
}

class ChildClass{

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "class ChildClass";
	}
	
	
}

class InstanceTypeShower {
	int showCnt;
	
	InstanceTypeShower(){
		showCnt =0;
	}
	public<T> void showInstType(T inst) {
		showCnt++;
		System.out.println(inst);
		
	}
	
	public<T,U> void showInstType(T inst1, U inst2) {
		showCnt++;
		System.out.println(inst1);
		System.out.println(inst2);
	}
	
	public void showPrintCnt() {
		System.out.println(showCnt);
	}
	

}

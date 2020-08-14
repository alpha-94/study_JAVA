package exam09;

class Person {

	private String name;
	private int milID;
	
	Person(String name, int mID){
		this.name = name;
		milID = mID;
		
	}
	
	Person(String name){
		this.name = name;
		milID = 0;
		
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		
		if(milID != 0) {
		System.out.println("군번 : " + milID);
		}
	}
}

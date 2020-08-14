package exam01;

class Police extends Gun{
	int handcuffs;
	

	
	Police(int bullet,int ahndcuff){
		super(bullet);
		this.handcuffs = handcuffs;
	}
	
	public void putHandcuff() {
		System.out.println("SNAP!!");
		handcuffs--;
	}
}

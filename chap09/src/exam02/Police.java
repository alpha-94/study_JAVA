package exam02;

class Police {
	int handcuffs;
	Gun gun;
	

	
	Police(int bullet, int handcuffs){
		
		if(bullet!=0) {
		 gun = new Gun(bullet);//필드생성 // 즉 상속의미보단 자체적으로 하나를 쓰게끔 
		}
		else {
			gun = null;
		}
		this.handcuffs = handcuffs;
	}
	
	Police(int handcuffs){
		gun = null;
		this.handcuffs = handcuffs;
		
		
	}
	
	public void putHandcuff() {
		System.out.println("SNAP!!");
		handcuffs--;
	}
	
	public void shut() {
		if(gun==null) {
			System.out.println("Hut BBANG");
			
		}else {
			gun.shut();
		}
	}
	
}

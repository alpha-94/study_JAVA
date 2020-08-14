package exam01;

class Gun {
	int bullet;
	
	Gun(int bullet){
		this.bullet = bullet;
		
	}
	
	public void shut() {
		if(bullet<1) {
			System.out.println("No bullet");
			return;
		}
		System.out.println("BBANG!!");
		bullet--;
		
	}
	
	
}

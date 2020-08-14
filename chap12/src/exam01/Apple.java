package exam01;

class Apple {
	
	int whight;
	
	Apple(int whight){
		this.whight = whight;
		
	}

	public void showAppleWeight() {
		System.out.println("사과의 무게 :: " + whight);
	}
}


class AppleBox{
	Apple item;
	public void store(Apple item) {
		this.item = item;
		
	}
	public Apple pullOut() {
		return item;
	}
}
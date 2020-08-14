package exam01;

class Orange {
	
	int sugarContent;
	
	Orange(int sugarContent){
		this.sugarContent=sugarContent;
		
	}
	
	public void showSugarContent(  ) {
		System.out.println("당분함량 :: " + sugarContent);
	}

	
}

class OrangeBox{
	Orange item;
	
	public void store(Orange item) {
		this.item = item;
	}
	
	public Orange pullOut() {
		return item;
	}
	
}
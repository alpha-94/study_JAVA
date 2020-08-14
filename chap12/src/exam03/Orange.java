package exam03;

class Orange {
	int sugarContent;
	
	Orange(int sugarContent){
		this.sugarContent=sugarContent;
		
	}
	
	public void showSugarContent(  ) {
		System.out.println("당분함량 :: " + sugarContent);
	}

}

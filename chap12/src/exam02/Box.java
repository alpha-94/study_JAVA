package exam02;

class Box {

	
}

class Fruitbox{
	Object item;
	
	public void store(Object item) {
		this.item = item;
		
	}
	
	public Object pullOut() {
		return item;
	}
}
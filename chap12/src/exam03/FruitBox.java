package exam03;

class FruitBox <T>{//자료형을 확정짓는게 아니다!
	T itemObject;
	
	public void store(T itemObject) {
		this.itemObject = itemObject;
	}
	
	public T pullOut() {
		return itemObject;
	}

}

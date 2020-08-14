package exam03;

public class GenericBaseFruitBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitBox appleBox = new FruitBox<Apple>(); //version 8 부터 가능
		Apple apple = new Apple(700);
		
		FruitBox<Orange> orangeBox = new FruitBox<Orange>();
		Orange orange = new Orange(7);
		
		appleBox.store(apple);
		appleBox.pullOut();
		
//		appleBox.store("사과:");
		
		Apple tmpApple = appleBox.pullOut();
		tmpApple.showAppleWeight();
		
		orangeBox.store(orange);
		orangeBox.pullOut();
		
		
		
	}

}

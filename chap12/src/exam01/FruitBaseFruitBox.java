package exam01;

import java.security.AllPermission;

public class FruitBaseFruitBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apple apple = new Apple(500);
		AppleBox appleBox = new AppleBox();
		
		appleBox.store(apple);
		Apple tmpApple = appleBox.pullOut();
		tmpApple.showAppleWeight();
		
		
		System.out.println("++++++++++++++++++++");
		
		Orange orange = new Orange(500);
		OrangeBox orangeBox = new OrangeBox();
		
		
		orangeBox.store(orange);
		
		Orange tmpOrange = orangeBox.pullOut();
		
		tmpOrange.showSugarContent();
		
	}

}

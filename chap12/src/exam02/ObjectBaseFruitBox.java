package exam02;



public class ObjectBaseFruitBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Orange orange = new Orange(10);
		Apple apple = new Apple(500);
		
		
		Fruitbox orangebox = new Fruitbox();
		Fruitbox applebox = new Fruitbox();
		
		orangebox.store(orange);
		applebox.store(apple);
		
		Orange tmpOrange = (Orange)orangebox.pullOut();
		Apple tmpApple = (Apple)applebox.pullOut();
		tmpApple.showAppleWeight();
		tmpOrange.showSugarContent();
		
		
		Fruitbox objectBox = new Fruitbox();
		
		objectBox.store("사과");// 범용적인 자료형 선언은 가능하지만 자료형에 안전하지 않다
		
	}

}


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

class Apple {
	
	int whight;
	
	Apple(int whight){
		this.whight = whight;
		
	}

	public void showAppleWeight() {
		System.out.println("사과의 무게 :: " + whight);
	}
}
package exam04;

public class IntroGenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FatherClass father = new FatherClass();
		ChildClass child = new ChildClass();
		
		
		InstanceTypeShower shower = new InstanceTypeShower();
		
		//shower.<FatherClass>showInstType(father);
		shower.showInstType(father);
		shower.<ChildClass>showInstType(child);
		
//		shower.<FatherClass, ChildClass>showInstType(father, child);
		shower.<FatherClass, ChildClass>showInstType(father, child);
		
		
		
	}

}

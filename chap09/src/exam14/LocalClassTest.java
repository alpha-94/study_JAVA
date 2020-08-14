package exam14;

public class LocalClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outer = new OuterClass("First");
		
		
		
		Readerble localCalss = outer.createLocalClssInst(3);
		localCalss.read();

	}

}

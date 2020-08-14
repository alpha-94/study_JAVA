package exam15;

class self{
	private int num;
	
	self(){
		num= 5;
	}
	public static void makeSlef() {
		//new self();
		
	}
	
	public void useSlef() {
		System.out.println("num = " +num);
		new self();
	}
	
}

public class SlefInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		self.makeSlef();
		self self1 = new self();
		self self2 = new self();
		self1.useSlef();
		self2.useSlef();
		self1.useSlef();
	}

}

package exam04;


class Adder{
	public static int val = 0;

	Adder(){

	}
	
	public void add(int num) {
		val += num;
	}
}

class AdderFriend extends Adder{
	AdderFriend(){
		super();
	}
	public void friendAdd(int num) {
		val+= num;
	}
	
	public void showVal() {
		System.out.println(val);
	}
}



public class StaticInheritance {
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder adder = new Adder();
		
		adder.add(1);
		
		System.out.println(adder.val);
		System.out.println(Adder.val); // 클래스 변수
		
		AdderFriend aFriend = new AdderFriend();
		aFriend.add(1);
		System.out.println(aFriend.val);
		
		System.out.println(AdderFriend.val);
		
		
	}

}

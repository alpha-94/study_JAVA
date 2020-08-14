package exam03;

public class BaseEnSpeaker extends Speak{//공통의 의미 IS-A
	
	private int baseRate;
	
	public int getBaseRate() {
		return baseRate;
		
	}
	public void setBaseRate(int baseRate) {
		this.baseRate = baseRate;
	}
	
	public void showCurrentState() {
		super.showCurrentState();
		System.out.println("베이스크기 : " + getBaseRate());
	}
}

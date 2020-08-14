package exam03;

public class Speak {
	private int volumeRate;
	
	private int getVolumeRate() { //
		return volumeRate;
	}
	
	public void setVolumeRate(int vol) {
		this.volumeRate = vol;
	}

	
	public void showCurrentState() {
		System.out.println("볼륨크기 : " + getVolumeRate());
		
	}
}

package exam03;

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Speak sperker = new Speak();
		
		sperker.setVolumeRate(5);
		
		sperker.showCurrentState();
		
		BaseEnSpeaker baseSpeaker = new BaseEnSpeaker();
		
		baseSpeaker.setVolumeRate(7);
		baseSpeaker.setBaseRate(5);
		
		baseSpeaker.showCurrentState();
		
		
		new BaseEnSpeaker();
		
		Speak speaker2 = new BaseEnSpeaker();
//		BaseEnSpeaker speaker3 = new Speak();
		
		speaker2.setVolumeRate(5);
//		speaker2.setBaseRate(7); speak 로 자료형 생성 했기 때문
		
		speaker2.showCurrentState();
		
		
	}

}

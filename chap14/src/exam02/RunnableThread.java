package exam02;

class Sum{
	int num;
	
	Sum(){
		num=0;
	}
	public void addNum(int num) {
		this.num += num;
	}
	public int getNum() {
		return num;
	}
}
//이미 자료형이 만들어 졌으면 추가로 쓰레드를 만들기 위한 방법
class AddThread extends Sum implements Runnable{//쓰레드 자료형과는 전혀 상관 X 

	int start,end;
	
	AddThread(int start, int end){
		this.end = end;
		this.start = start;
	}
	
	@Override 
	public void run() {
		for (int i = start; i <=end; i++) {
			addNum(i);
		}
	}
	
}


public class RunnableThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddThread at1 = new AddThread(0,50);
		AddThread at2 = new AddThread(51,100);
		
		Thread thread1 = new Thread(at1);
		Thread thread2 = new Thread(at2);
		
		thread1.start();// 시작시점은 알 수 없다 . 
		thread2.start();// 실행은 했지만 메인이 먼저 끝나버려서 실행 중간의getNum의 초기값을 읽어버림
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("1~100까지의 합 :: " + (at1.getNum()+at2.getNum()));
		
		
	}

}

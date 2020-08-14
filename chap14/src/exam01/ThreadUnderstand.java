package exam01;

class SumThread extends Thread{
	
	String threadName;
	int start, end;
	
	SumThread(String name, int start, int end){
		this.end = end;
		this.start = start;
		this.threadName = name;
	}

	@Override
	public void run() {//메인 메서드 내 작동구현 효과를 지니는 메서드 => 멀티 쓰레드 !
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = start; i < end; i++) {
			sum+=i;
			System.out.println(threadName);
		}
		System.out.printf("%s => %d ~ %d 의 합 %d \n ",threadName, start, end, sum);
		
	}
	
}

public class ThreadUnderstand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumThread thread1 = new SumThread("thread1", 1 ,10);
		SumThread thread2 = new SumThread("thread2", 11 ,20);
		int sum=0;
		
		
		thread1.start();		//run 메서드 호출
		thread2.start();		//run 메서드 호출
		
		for (int i = 1; i < 50; i++) {
			sum+=1;
			System.out.println("main");
		}
		
		System.out.println("main() 메서드 실행 => 1~50까지의 합" +sum);
		
		System.out.println("프로그램 종료////");
		
		
	}

}

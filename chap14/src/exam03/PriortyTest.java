package exam03;

class MessageSendingThread extends Thread{

	String message;
	
	MessageSendingThread(String message,int prio){
		this.message = message;
		setPriority(prio);//우선권!
	}
	@Override
	public void run() {
		int ins=0;
		for (int i = 0 ; i < 1000 ; i++) {
			System.out.printf("%s (%d) \n",message,getPriority());
			ins=i;
		}
		System.out.println(ins);
	}
	
}


public class PriortyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageSendingThread tr1 = new MessageSendingThread("ex1", Thread.MAX_PRIORITY);//1번째 출력
		MessageSendingThread tr2 = new MessageSendingThread("ex2", Thread.NORM_PRIORITY);//2번째 출력
		MessageSendingThread tr3 = new MessageSendingThread("ex3", Thread.MIN_PRIORITY);//3번째 출력
		
		tr1.start();
		tr2.start();
		tr3.start();
		
		try {
			tr1.join();
			tr2.join();
			tr3.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

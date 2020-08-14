package exam04;

class Sum{
	int num;
	
	Sum(){
		num=0;
	}
	public synchronized void addNum(int num) {
		//synchronized : 할당시킨 시간이 지나도 동작을 완성 시키는 명령어
		//즉 동기화 시키는 명령어 => 퍼포먼스 ↓
		this.num += num;	//at1 에 있는 num 입력값을 받아서 
								//this.num에 담으려고 했는데 시간이 다 되어서 at2를 호출해버림
								//결국 at1 의 값이 담기지 못하기 때문에 정상적인 값이 출력되지 않는다!
	}
	public int getNum() {
		return num;
	}
}

class AdderThread extends Thread{
	Sum sumInst;
	int start,end;
	AdderThread(Sum sum, int s,int e){
		this.sumInst = sum;
		this.end = e;
		this.start = s;
	}
	
	@Override
	public void run() {
		int t = 0;
		// TODO Auto-generated method stub
		for (int i = start; i <= end; i++) {
			sumInst.addNum(i);
			t=i;
		}
		System.out.println(t);
	}
	
}


public class ThreadHeapMultiAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum sum = new Sum();
		
		AdderThread at1 = new AdderThread(sum,1,5000);
		AdderThread at2 = new AdderThread(sum,5001,10000);
		
		at1.start();
		at2.start(); 
		
		try {
			at1.join();//하나의 자료형을 바라보고 있을때 !
			at2.join();// 둘 이상의 쓰레드가 하나의 메모리 공간(자료형 필드)에 동시 접근하는것은 문제를 일으킨다
			//at1 의 시간 할당이 다 되어서 at2로 넘어가는 현상이 발생
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1~10000 까지의 합 ! :: " + sum.getNum());

	}

}

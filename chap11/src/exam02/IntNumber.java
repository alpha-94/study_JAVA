package exam02;

class IntNumber {

	
	int num;
	
	public IntNumber(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		IntNumber intNumber = (IntNumber) obj;
		if(num == intNumber.num) {
			return true;
		}else {
			return false;
		}
	}//왜 제공할까 ...값에대한 비교의  오버라이딩 하라고 만든거임
	
	
}

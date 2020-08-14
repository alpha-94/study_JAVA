package exam04;

class Point implements Cloneable{//instanceof 로 인해서  구분

	private int xPos;
	private int yPos;
	
	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.xPos = x;
		this.yPos =y;
	}
	
	public void showPosition() {
		System.out.printf("(%d, %d) \n", xPos,yPos);
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();//복사하고 난 다음의 복사된 주소값 리턴 단, 오브젝트 자료형으로 반환
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		
		return super.toString();
	}
	
	
	
}

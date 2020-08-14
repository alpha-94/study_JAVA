package exam11;

class PointTwo {
	private int xPos, yPos;
	
	PointTwo(int x, int y){
		this.xPos = x;
		this.yPos = y;
		
		
		
	}

	@Override
	public String toString() {
		String posInfo = "[x pos : " + xPos + ", yPos : " + yPos + "]";
		return posInfo;
	}

}

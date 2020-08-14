package exam11;

class PointOne extends Object implements UpperCasePrintable{
	private int xPos, yPos;
	
	PointOne(int x, int y){
		this.xPos = x;
		this.yPos = y;
		
		
		
	}

	@Override
	public String toString() {
		String posInfo = "[x pos : " + xPos + ", yPos : " + yPos + "]";
		return posInfo;
	}

}

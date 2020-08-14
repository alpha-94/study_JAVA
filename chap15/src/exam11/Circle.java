package exam11;

import java.io.Serializable;

class Circle implements Serializable{
	int xPos , yPos;
	transient double rad;
	
	
	Circle(int xPos, int yPos, double rad){
		this.rad = rad;
		this.xPos = xPos;
		this.yPos = yPos;
		
	}
	
	public void showCircleInfo() {
		System.out.printf("[%d,%d] \n",xPos,yPos);
		System.out.printf("rad : %f\n",rad);
	}

}

package exam01;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class JFlowsayout extends JFrame{
	JFlowsayout(){
		Container container = getContentPane();
		
		//기본정렬 Center
//		container.setLayout(new FlowLayout());
		
		container.setLayout(new FlowLayout(FlowLayout.LEFT,10,50));
		//FlowLayout.RIGHT 오른쪽 정렬
		//FlowLayout.LEFT 왼쪽 정렬
		//FlowLayout.LEFT,X,Y X : 수평간격 , Y : 수직간격
		
		
		for (int i = 1; i <=15; i++) {
			container.add(new JButton("버튼" + i));
			
		}
		setTitle("버튼 컴푸넌트 테스트");
		setSize(500,180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
}

public class sw06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JFlowsayout();
	}

}

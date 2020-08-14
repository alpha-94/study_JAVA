package exam01;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class JGridLayout extends JFrame{
	
	JGridLayout(){
		Container container = getContentPane();
		
		
		//행렬 레이아웃
//		container.setLayout(new GridLayout(3,5));
//		container.setLayout(new GridLayout(4,4));
		
		container.setLayout(new GridLayout(3,5,5,10));
		
		for (int i = 0; i < 15; i++) {
			container.add(new JButton("버튼 :: " + i));
			
		}
		setTitle("행렬");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
}

public class sw08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JGridLayout();
		

	}

}

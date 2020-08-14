package exam01;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

class JBorderLayout extends JFlowsayout{
	
	
	JBorderLayout(){
		Container container = getContentPane();
//		container.setLayout(new BorderLayout());	
		container.setLayout(new BorderLayout(10,10));	
		
		container.add(new JButton("동쪽버튼"),BorderLayout.EAST);
		container.add(new JButton("서쪽버튼"),BorderLayout.WEST);
		container.add(new JButton("남쪽버튼"),BorderLayout.SOUTH);
		container.add(new JButton("북쪽버튼"),BorderLayout.NORTH);
		container.add(new JButton("중앙버튼"),BorderLayout.CENTER);
		
		setTitle("55");
		setSize(500,180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
}


public class sw07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JBorderLayout();
		

	}

}

package exam01;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class JPannelTest extends JFrame{
	
	
	JPannelTest(){
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(5,1));
		jp1.add(new JButton("JAVA"));
		jp1.add(new JButton("R"));
		jp1.add(new JButton("PYTHON"));
		jp1.add(new JButton("DB"));
		jp1.add(new JButton("WEB"));
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(4,1));
		
		jp2.add(new JRadioButton("java"));
		jp2.add(new JRadioButton("c++"));
		jp2.add(new JRadioButton("python"));
		jp2.add(new JRadioButton("db"));
		
		
		
		
		container.add(jp1,BorderLayout.WEST);
		container.add(jp2,BorderLayout.EAST);
		
		setTitle("행렬");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}

public class sw10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JPannelTest();
	}

}

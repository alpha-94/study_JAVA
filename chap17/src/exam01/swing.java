package exam01;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class JImageTest extends JFrame{
	JImageTest(){
		ImageIcon ii = new ImageIcon("./images/korea.png");
		
		JButton korea = new JButton("클릭",ii);
		
		getContentPane();
		
		Container container = getContentPane();
		
		container.setLayout(new FlowLayout());
		container.add(korea);
		setTitle("버튼 컴푸넌트 테스트");
		setSize(500,180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
}

public class swing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JImageTest();
	}
}

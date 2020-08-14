package exam03;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.LayerUI;

class ButtonTest extends JFrame{
	ButtonTest(){
		JButton male = new JButton("남자");
		JButton female = new JButton("여자");
		JLabel label = new JLabel("당신의 성별은? ");
		
		Container container = getContentPane();
		
		FlowLayout layout = new FlowLayout();
		
		container.setLayout(layout);
		container.add(male);
		container.add(female);
		container.add(label);
		
		setTitle("버튼 컴푸넌트 테스트");
		setSize(300,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	
	}
}

public class Swing01 {
	public static void main(String[] args) {
		new ButtonTest();
		
		
	}
	
}

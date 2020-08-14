package exam01;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class JButtonEvent extends JFrame{
	JButtonEvent(){
		//3 개국 이미지 아이콘화
		ImageIcon korea = new ImageIcon("images/korea1.gif");
		ImageIcon usa = new ImageIcon("images/usa.gif");
		ImageIcon germany = new ImageIcon("images/germany.gif");
		
		JButton event = new JButton(korea);
		
		event.setRolloverIcon(usa);
		
		event.setPressedIcon(germany);
		
		getContentPane();
		
		Container container = getContentPane();
		
		container.setLayout(new FlowLayout());
		container.add(event);
		
		setTitle("JButton 자체 이벤트 처리");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}

public class siwng05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JButtonEvent();
	}

}

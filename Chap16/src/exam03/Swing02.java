package exam03;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ButtonEvent extends JFrame implements ActionListener{
	ButtonEvent(){
		JButton male = new JButton("남자");
		JButton female = new JButton("여자");
		JLabel label = new JLabel("당신의 성별은? ");
		JLabel result = new JLabel("결과!");
		
		Container container = getContentPane();
		
		FlowLayout layout = new FlowLayout();
		
		container.setLayout(layout);
		container.add(male);
		container.add(female);
		container.add(label);
		container.add(result);
		
		//이벤트 처리를 위한 버튼에 리스너 등록.
		male.addActionListener(this);
		female.addActionListener(this);
		
		
		setTitle("버튼 컴푸넌트 테스트");
		setSize(300,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(result.setText(text););
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼을 눌리는것에 대한 인터페이스 오버라이딩
		resu
	}
}

public class Swing02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

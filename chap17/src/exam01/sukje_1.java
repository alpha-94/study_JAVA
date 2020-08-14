package exam01;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ImageKorea extends JFrame implements ActionListener{
	
	private JLabel result;
	ImageKorea(){		
		
		ImageIcon korea1 = new ImageIcon("images/korea1.gif");
		JButton korea = new JButton("",korea1);
		JLabel label = new JLabel("");
		result = new JLabel();
	
		Container container = getContentPane();
		FlowLayout layout = new FlowLayout();
		
		container.setLayout(layout);
		container.add(korea);
		container.add(label);
		container.add(result);
		
		korea.setActionCommand("대한민국!");
		korea.addActionListener(this);
		
		
		setTitle("대한민국");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		result.setText(e.getActionCommand());

	}
}

public class Swing_04 {
	/*
	 * 문) Swing03의 결과 화면에서 이미지 버튼을 클릭하면
	 *      "대한민국 버튼 클릭"이라는 메세지가 버튼의 오른쪽에
	 *      표시되도록 이벤트를 적용하세요.
	 *      또한 프레임의 제목을 "여기는 대한민국 입니다."라고
	 *      변경하세요.
	 */
	public static void main(String[] args) {
		new ImageKorea();
	}

}

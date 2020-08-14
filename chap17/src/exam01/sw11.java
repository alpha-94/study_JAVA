package exam01;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class JTextFieldTextArea extends JFrame implements ActionListener{
	JTextArea jta;
	JTextField jtf;
	JTextFieldTextArea(){
		jtf = new JTextField(10);
		jta = new JTextArea(7,20);
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		container.add(jtf);
		container.add(jta);
		
		jtf.addActionListener(this);
		
		
		setTitle("텍스트필드 텍스트 에어리어 실습");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		jta.setText(e.getActionCommand());
		jta.append(e.getActionCommand()+"\n");
		jtf.setText("");
		
	}
	
}

public class sw11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JTextFieldTextArea();
		
	}

}

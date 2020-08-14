package exam01;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class JRadioButtonTest extends JFrame implements ActionListener{
	
	JTextField jtfField;
	
	JRadioButtonTest(){
		ButtonGroup bg = new ButtonGroup();
		
		JRadioButton jrb1 = new JRadioButton("승마");
		JRadioButton jrb2 = new JRadioButton("골프");
		JRadioButton jrb3 = new JRadioButton("스쿠버");
		JRadioButton jrb4 = new JRadioButton("글라이딩");
		
		jtfField = new JTextField(10);
		
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		
		Container container = getContentPane();
		
		container.setLayout(new FlowLayout());
		container.add(jrb1);
		container.add(jrb2);
		container.add(jrb3);
		container.add(jrb4);
		container.add(jtfField);
		
		jrb1.addActionListener(this);
		jrb2.addActionListener(this);
		jrb3.addActionListener(this);
		jrb4.addActionListener(this);
		
		setTitle("체크박스 실습");
		setSize(500,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		jtfField.setText(e.getActionCommand());
		
		
	}
	
}


public class sw13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JRadioButtonTest();

	}

}

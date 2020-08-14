package exam01;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class JCheckBoxTest extends JFrame implements ItemListener{
	JTextField jtfField;
	
	
	JCheckBoxTest(){
		JCheckBox jbc1 = new JCheckBox("JAVA");
		JCheckBox jbc2 = new JCheckBox("R");
		JCheckBox jbc3= new JCheckBox("python");
		JCheckBox jbc4= new JCheckBox("db");
		
		jtfField = new JTextField(10);
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		container.add(jbc1);
		container.add(jbc2);
		container.add(jbc3);
		container.add(jbc4);
		container.add(jtfField);
		
		jbc1.addItemListener(this);
		jbc2.addItemListener(this);
		jbc3.addItemListener(this);
		jbc4.addItemListener(this);
		
		
		
		setTitle("체크박스 실습");
		setSize(500,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("이벤트 발생");
		JCheckBox selectCB = (JCheckBox)e.getItem();
		jtfField.setText(selectCB.getText());
		
		switch (selectCB.getText()) {
		case "JAVA":
			
			break;
			
		case "R":
			
			break;
			
		case "python":
	
			break;
			
		case "db":
	
			break;

			
		default:
			break;
		}
		
	}
}

public class sw12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JCheckBoxTest();

	}

}

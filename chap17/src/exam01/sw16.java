package exam01;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

class JRadioPanel extends JPanel implements ActionListener{
	JLabel jl2;
	
	JRadioPanel(){
		jl2 = new JLabel("");
		
		JLabel jl1 = new JLabel("당신의 성별은??");
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton jr1 = new JRadioButton("남성");
		JRadioButton jr2 = new JRadioButton("여성");
		
		bg.add(jr1);
		bg.add(jr2);
		
		//Container container = new Container();
		//패널 컨테이너는 별도로 인스턴스 안해도 됨
		add(jr1);
		add(jr2);
		add(jl1);
		add(jl2);
		
		jr1.addActionListener(this);
		jr2.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		jl2.setText(e.getActionCommand());
		
	}
}

class JComboboxPanel extends JPanel implements ItemListener{
	JLabel jl2;
	JComboboxPanel(){
		JLabel jl1 = new JLabel("당신의 혈액형은??");
		jl2 = new JLabel("");
		
		JComboBox<String> jcb = new JComboBox<String>();
		
		jcb.addItem("A형");
		jcb.addItem("B형");
		jcb.addItem("AB형");
		jcb.addItem("O형");
		
		add(jl1);
		add(jcb);
		add(jl2);
		
		jcb.addItemListener(this);
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String item =(String)e.getItem();
		jl2.setText(item);
	}
}


class JTabbedPeneFrame extends JFrame{
	
	JTabbedPeneFrame(){
	
		JRadioPanel tap1 = new JRadioPanel();
		JComboboxPanel tap2 = new JComboboxPanel();
		
		JTabbedPane jtp = new JTabbedPane();
		
		jtp.addTab("성별", tap1);
		jtp.addTab("혈액형", tap2);
		
		Container container = getContentPane();
		
		container.add(jtp);
		
		
		
		setTitle("체크박스 실습");
		setSize(500,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
		
	}
	
	
	
}

public class sw16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTabbedPeneFrame();
		
	}

}

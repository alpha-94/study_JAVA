package exam01;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JComboBoxTest extends JFrame implements ItemListener{
//	ImageIcon ii;
	JLabel jl;
	
	
	JComboBoxTest(){
		ImageIcon ii = new ImageIcon("./images/banana.jpg");
		jl = new JLabel(ii);
		
		
		
		
		JComboBox<String> jc = new JComboBox<String>();
		jc.addItem("banana");
		jc.addItem("pear");
		jc.addItem("apple");
		jc.addItem("grape");
		
		Container container = getContentPane();
		
		container.setLayout(new FlowLayout());
		
		
		container.add(jl);
		container.add(jc);
		
		//이벤트 리스너 등록
		jc.addItemListener(this);
		
		
		
		setTitle("체크박스 실습");
		setSize(500,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// 선택된 항목의 list 이미지를 출력
		
		String friutString = (String)e.getItem();
		jl.setIcon(new ImageIcon("./images/"+friutString+".jpg"));
		
		
	}
	
}

public class sw14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JComboBoxTest();

	}

}

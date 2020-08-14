package exam01;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class JTableDemo extends JFrame implements MouseListener{
	
	JTableDemo(){
		String[] colHeadStrings = {"학과", "학번", "이름"};
		Object[][] data = {
				{ "IT응용공학전공", "201095029", "김지연" },
				{ "컴퓨터응용공학전공", "201195007", "김대연" },
				{ "인터넷응용공학전공", "201195072", "이현덕" },
				{ "멀티미디어공학전공", "201096041", "김기창" },
				{ "IT응용공학전공", "201198001", "이명찬" },
				{ "정보통신공학전공", "201198074", "강재근" },
				{ "인터넷응용공학전공", "201195012", "임자용" },
				{ "멀티미디어공학전공", "201196025", "문정숙" },
				{ "IT응용공학전공", "201198016", "하종섭" },
				{ "데이타베이스공학전공", "201197011", "안진숙" },
				{ "IT응용공학전공", "201198009", "서은실" },
				{ "데이타베이스공학전공", "201197008", "장희숙" },
				{ "멀티미디어공학전공", "201196033", "장현석" }
				};
		
		JTable table = new JTable(data,colHeadStrings);
		JScrollPane jsp = new JScrollPane(table);
		
		Container container = getContentPane();
		
		container.setLayout(new BorderLayout());
		
		container.add(jsp,BorderLayout.CENTER);
		
		table.addMouseListener(this);
		
		
		setTitle("체크박스 실습");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseClicked");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseEntered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseExited");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mousePressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseReleased");
	}
}


public class sw17 {
	
	public static void main(String[] args) {
		
		new JTableDemo();
		
	}

}

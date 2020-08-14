package exam01;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

class JMenuDemo extends JFrame implements ActionListener{
	JTextField jtf;
	
	JMenuDemo(){
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		
		jtf = new JTextField();
		
		container.add(jtf,BorderLayout.SOUTH);
		
		JMenu file = new JMenu("파일(F)");
		
		
		JMenuItem 
		jmi = new JMenuItem("새로 만들기(N)");
		file.add(jmi);
		jmi.addActionListener(this);
		jmi = new JMenuItem("새 창(W)");
		file.add(jmi);
		jmi.addActionListener(this);
		jmi = new JMenuItem("열기(W)");
		file.add(jmi);
		jmi.addActionListener(this);
		jmi = new JMenuItem("저장(W)");
		file.add(jmi);
		jmi.addActionListener(this);
		jmi = new JMenuItem("끝내기(W)");
		file.add(jmi);
		jmi.addActionListener(this);
		
		
//		file.add(new JMenuItem("새로 만들기(N)"));
//		file.add(new JMenuItem("새 창(W)"));
//		file.add(new JMenuItem("열기(W)"));
//		file.add(new JMenuItem("저장(W)"));
//		file.add(new JMenuItem("끝내기(W)"));
		
		
		JMenu edit = new JMenu("편집(E)");
		
		jmi = new JMenuItem("실행취소");
		edit.add(jmi);
		jmi.addActionListener(this);
		jmi = new JMenuItem("붙여넣기");
		edit.add(jmi);
		jmi.addActionListener(this);
		jmi = new JMenuItem("복사");
		edit.add(jmi);
		jmi.addActionListener(this);
		
		
		
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(file);
		menuBar.add(edit);
		
		setJMenuBar(menuBar);
		
		setTitle("실습");
		setSize(400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		jtf.setText(e.getActionCommand());
		
		switch (e.getActionCommand()) {
		case "끝내기(W)":
			
			break;
		case "새로 만들기(N)":
			
			break;

		default:
			break;
		}
		
		
		
	}
	
}


public class sw18 {
	public static void main(String[] args) {
		
		new JMenuDemo();
		
	}

}

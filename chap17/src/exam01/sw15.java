package exam01;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

class JListTest extends JFrame{
	String[] sprorts = {"농구", "축구", "배구", "야구", "테니스", "핸드볼"};
	
	JListTest(){
		JList<String> jl = new JList<String>(sprorts);
		jl.setVisibleRowCount(3);
		
		JScrollPane jp = new JScrollPane(jl);
		
		Container container = getContentPane();
		
		container.setLayout(new FlowLayout());
		
		container.add(jp);
		
		setTitle("체크박스 실습");
		setSize(500,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
}

public class sw15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JListTest();
		

	}

}

package exam01;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class FruitName extends JFrame implements ActionListener {
	JLabel fruitName;
	
	FruitName(){
		
		ImageIcon apple = new ImageIcon("images/apple.jpg");
		ImageIcon pear = new ImageIcon("images/pear.jpg");
		ImageIcon gam = new ImageIcon("images/persimmon.jpg");
		ImageIcon banana = new ImageIcon("images/banana.jpg");
		ImageIcon grape = new ImageIcon("images/grape.jpg");
		
		Container container = getContentPane();
		container.setLayout(new GridLayout(3,2));
		
		JButton applButton = new JButton("사과",apple);
		JButton pearButton = new JButton("배",pear);
		JButton gamButton = new JButton("감",gam);
		JButton bananaButton = new JButton("바나나",banana);
		JButton grapeButton = new JButton("포도",grape);
		fruitName = new JLabel();
		
		container.add(applButton);
		container.add(pearButton);
		container.add(gamButton);
		container.add(bananaButton);
		container.add(grapeButton);
		container.add(fruitName);
		
		applButton.addActionListener(this);
		pearButton.addActionListener(this);
		gamButton.addActionListener(this);
		bananaButton.addActionListener(this);
		grapeButton.addActionListener(this);
		
		setTitle("과제");
		setSize(270,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		fruitName.setText(e.getActionCommand());
	}
}


public class Swing_09 {

	public static void main(String[] args) {
		new FruitName();
		
	}

}

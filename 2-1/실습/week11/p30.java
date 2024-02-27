package week11;
//BorderLayout 배치관리자를 사용하는 예

import javax.swing.*;
import java.awt.*;

public class p30 extends JFrame {
	public p30() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(30, 20));
		c.add(new JButton("add"), BorderLayout.CENTER);
		c.add(new JButton("sub"), BorderLayout.NORTH);
		c.add(new JButton("mul"), BorderLayout.SOUTH);
		c.add(new JButton("div"), BorderLayout.EAST);
		c.add(new JButton("Calculate"), BorderLayout.WEST);
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p30();

	}

}

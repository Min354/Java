package week12;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class p23 extends JFrame {
	private JLabel la = new JLabel("Hello");
	
	public p23() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		
		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(250,250);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p23();

	}
	class MyMouseListener extends MouseAdapter{ //adaptor extends 해주면 아래 구현 필요 없음
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	
	}

}

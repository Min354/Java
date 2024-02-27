package week12;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class p19 extends JFrame {
	private JLabel la = new JLabel("Hello");
	
	public p19() {
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
		new p19();

	}
	class MyMouseListener implements MouseListener{ //adaptor extends 해주면 아래 구현 필요 없음
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
		public void mouseReleased(MouseEvent e) {};
		public void mouseClicked(MouseEvent e) {};
		public void mouseEntered(MouseEvent e) {};
		public void mouseExited(MouseEvent e) {};
		
	}

}

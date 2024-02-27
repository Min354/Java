package 과제6;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class 과제6_1 extends JFrame {	
	public 과제6_1() {
		setTitle("드래깅동안 YELLOW로 변경");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.GREEN);
		
		MyMouseMotionListener listener = new MyMouseMotionListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		setSize(300, 200);
		setVisible(true);
	}
	
	class MyMouseMotionListener extends MouseAdapter{
		public void mouseDragged(MouseEvent e) {	
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		public void mouseReleased(MouseEvent e) {	
			Component c = (Component)e.getSource();
			c.setBackground(Color.GREEN);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 과제6_1();

	}

}

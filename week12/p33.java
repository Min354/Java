package week12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p33 extends JFrame {
	private JLabel la = new JLabel();
	
	public p33() {
		setTitle("KeyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			la.setText(e.getKeyText(e.getKeyCode()) + " 입력되었음");

			Container contentPane = getContentPane();
			
			if(e.getKeyChar() == '%')
				contentPane.setBackground(Color.YELLOW);
			else if(e.getKeyCode() == KeyEvent.VK_F1)
				contentPane.setBackground(Color.green);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p33();
	}

}

package 과제6;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class 과제6_3 extends JFrame {
	private JLabel la = new JLabel("C");
	public 과제6_3() {
		setTitle("클릭 연습용 스윙 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		c.addMouseListener(new MyMouseListener());
		
		la.setLocation(50, 50);
		la.setSize(100,20);
		c.add(la);
		
		setSize(300, 300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyMouseListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			//300*300에서만 보이게 설정
			la.setLocation((int)(Math.random()*300),(int)(Math.random()*300)); 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 과제6_3();
	}

}

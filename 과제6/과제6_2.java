package 과제6;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class 과제6_2 extends JFrame {
	private JLabel la = new JLabel("Love Java");
	private float f=15.0f;
	
	public 과제6_2() {
		setTitle("+,-키로 폰트 크기 변경");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.add(la);
		la.setFont(la.getFont().deriveFont(f));
		
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(300, 150);
		setVisible(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			//(쉬프트 없이)+키를 치면 실질적 입력값은 =
			if(e.getKeyCode() == KeyEvent.VK_EQUALS) {
				f+=5.0f;
				la.setFont(la.getFont().deriveFont(f));
			}
			else if(e.getKeyCode() == KeyEvent.VK_MINUS && f > 5) {
				f-=5.0f;
				la.setFont(la.getFont().deriveFont(f));
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 과제6_2();
	}

}

package 과제5;

import javax.swing.*;
import java.awt.*;

public class 과제5_문제1 extends JFrame {

	public 과제5_문제1 () {
		setTitle("4*4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(4, 4);
		Container c = getContentPane();
		c.setLayout(grid);
	
		
		JLabel [] la = new JLabel[16];
		
		
		for(int i=0;i<16;i++)
		{
			la[i] = new JLabel(String.valueOf(i));
			la[i].setOpaque(true);
			la[i].setBackground(Color.getHSBColor(i*100, i*100, i*25)); //HSB코드로 주는 방법
			c.add(la[i]);
		}
		la[12].setBackground(Color.WHITE); //일일히 지정하는 방법(배열 하나하나 다 부여해줘야하낟)
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 과제5_문제1();

	}

}

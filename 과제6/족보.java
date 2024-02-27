package 과제6;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class 족보 extends JFrame {
	public 족보() {
		setTitle("");
		Container c = getContentPane();
		GridLayout grid = new GridLayout(4,5,0,0);
		c.setLayout(grid);
		JButton [] bu = new JButton[20];
		for(int i=0;i<20;i++)
		{
			bu[i] = new JButton (String.valueOf(i));
			bu[i].setBackground(Color.getHSBColor(i*100, i*100, i*100));
			c.add(bu[i]);
			
		}
		
		
		setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 족보();
	}

}

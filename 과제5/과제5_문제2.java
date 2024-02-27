package 과제5;

import javax.swing.*;
import java.awt.*;


public class 과제5_문제2 extends JFrame{
	public 과제5_문제2 () {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(20, 20));
		
		JPanel gPanel = new JPanel();	//BorderLayout 센터 패널 생성
		GridLayout grid = new GridLayout(4, 4);		
		grid.setVgap(5);
		grid.setHgap(5);
        gPanel.setLayout(grid);
        
        JButton [] button = new JButton[16];	//BorderLayout 센터 패널 구현
        for(int i=0; i<10; i++)
        {
        	button[i] = new JButton(String.valueOf(i));
        }
        button[10] = new JButton("CE");
        button[11] = new JButton("계산");
        button[12] = new JButton("+");
        button[13] = new JButton("-");
        button[14] = new JButton("x");
        button[15] = new JButton("/");
        for(int i=12; i<16; i++)
        {
        	button[i].setBackground(Color.CYAN);
        }
        for(int i=0; i<16; i++)
        {
        	gPanel.add(button[i]);
        }
		
        JPanel[] FPanel = new JPanel[2];	//BorderLayout 남북 패널 생성
        FPanel[0] = new JPanel();
        FPanel[1] = new JPanel();
		FlowLayout[] flow = new FlowLayout[2];	 
		flow[0] = new FlowLayout(FlowLayout.CENTER, 10, 10);
		FPanel[0].setLayout(flow[0]);
		FPanel[0].setBackground(Color.GRAY);
		flow[1] = new FlowLayout(FlowLayout.LEFT, 10, 10);
		FPanel[1].setLayout(flow[1]);
		FPanel[1].setBackground(Color.YELLOW);
		
		FPanel[0].add(new JLabel("수식입력")); //BorderLayout 남북 패널 구현
		FPanel[0].add(new JTextField("		"));
		FPanel[1].add(new JLabel("계산 결과"));
		FPanel[1].add(new JTextField("		"));
		
		
		c.add(gPanel, BorderLayout.CENTER);		//BorderLayout에 배치
		c.add(FPanel[0], BorderLayout.NORTH);
		c.add(FPanel[1], BorderLayout.SOUTH);
		
		setSize(300,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 과제5_문제2();

	}

}

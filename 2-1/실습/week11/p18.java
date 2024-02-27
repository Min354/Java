package week11;
//컴포넌트 삽입(JButton)

import javax.swing.*;
import java.awt.*;

public class p18 extends JFrame{
	public p18() {
		setTitle("ContentPane & JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.MAGENTA);
		contentPane.setLayout(new FlowLayout()); //이거 없으면 버튼 하나가 창을 전부 차지함
		//없으면 기본으로 BorderLayout(default)로 설정되기 때문에 그것의 기능에따라 창을 가득 채우게 되는 것
		//그리고 이 플로우레이아웃은 awt에서 관리 중이라 임포트 필요
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancle"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p18 frame = new p18();
	}

}

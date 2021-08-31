package com.mega.mvc05.static1;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.font.ImageGraphicAttribute;
import java.awt.event.ActionEvent;

public class 연습문제 {
	private static JTextField t0;
	static int sum;
	final static int price = 5000;

	public static void main(String[] args) {
		//main이 static인 이유: 객체생성하지 않아도 main부터 시작하기 때문
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(143, 188, 143));
		f.setSize(800, 600);
		f.getContentPane().setLayout(null);
		
		JLabel l0 = new JLabel("마리");
		l0.setHorizontalAlignment(SwingConstants.CENTER);
		l0.setFont(new Font("돋움", Font.PLAIN, 21));
		l0.setBounds(633, 66, 97, 37);
		f.getContentPane().add(l0);
		
		t0 = new JTextField();
		t0.setBounds(534, 73, 116, 28);
		f.getContentPane().add(t0);
		t0.setColumns(10);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("C:\\Users\\tjoeun709\\Pictures\\e1.jpg"));
		img.setBounds(45, 113, 685, 294);
		f.getContentPane().add(img);
		
		JLabel result = new JLabel("기부금");
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setFont(new Font("굴림", Font.PLAIN, 21));
		result.setBounds(451, 438, 132, 37);
		f.getContentPane().add(result);
		
		JButton b1 = new JButton("코끼리");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				t0.setText(sum + "");
				ImageIcon icon = new ImageIcon("e1.jpg");
				img.setIcon(icon);
				result.setText(sum * price + "만원");
			}
		});
		b1.setBounds(102, 75, 97, 23);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("고래");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				t0.setText(sum + "");
				ImageIcon icon = new ImageIcon("e2.jpg");
				img.setIcon(icon);
				result.setText(sum * price + "만원");
			}
		});
		b2.setBounds(211, 75, 97, 23);
		f.getContentPane().add(b2);
		
		JButton b1_2 = new JButton("고릴라");
		b1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				t0.setText(sum + "");
				ImageIcon icon = new ImageIcon("e3.jpg");
				img.setIcon(icon);
				result.setText(sum * price + "만원");
			}
		});
		b1_2.setBounds(319, 75, 97, 23);
		f.getContentPane().add(b1_2);
		
		
		f.setVisible(true); //항상 맨 아래에 위치한다.
	}
}

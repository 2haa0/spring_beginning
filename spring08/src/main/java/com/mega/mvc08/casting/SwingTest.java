package com.mega.mvc08.casting;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingTest {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 500);
		f.setLayout(new FlowLayout());
		f.add(new Button("I'm Button!"));
		f.add(new JLabel("I'm Label!"));
		f.setVisible(true);
	}

}

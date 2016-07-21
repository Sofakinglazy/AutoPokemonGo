package gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ButtonPanel extends JPanel{

	private JButton recordBtn;
	private JButton startBtn;
	
	public ButtonPanel(){
		recordBtn = new JButton("Record");
		startBtn = new JButton("Start");
		
		recordBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Record Button");
			}
		});
		
		startBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Start Button");
			}
		});
		
		setLayout(new GridLayout(2, 1));
		add(recordBtn);
		add(startBtn);
	}
}

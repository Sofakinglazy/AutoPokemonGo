package gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ButtonPanel extends JPanel implements ActionListener{

	private JButton recordBtn;
	private JButton startBtn;
	private ButtonListener btnListener;
	
	public ButtonPanel(){
		recordBtn = new JButton("Record");
		startBtn = new JButton("Start");
		
		recordBtn.addActionListener(this);
		startBtn.addActionListener(this);
		
		setLayout(new GridLayout(2, 1));
		add(recordBtn);
		add(startBtn);
	}
	
	public void setBtnListener(ButtonListener btnListener){
		this.btnListener = btnListener;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		btnListener.clickBtn(btn.getText());
	}
}

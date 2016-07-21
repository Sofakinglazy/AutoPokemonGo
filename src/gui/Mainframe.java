package gui;

import java.awt.*;
import javax.swing.*;

public class Mainframe extends JFrame{
		
	private ButtonPanel btnsPanel;
	private TimerPanel timerPanel;
	
	public Mainframe(){
		super("Auto Pokemon Go");
		
		btnsPanel = new ButtonPanel();
		timerPanel = new TimerPanel();
		
		btnsPanel.setBtnListener(new ButtonListener() {
			public void clickBtn(String btnLabel) {
				if (btnLabel.equals("Start")){
					timerPanel.startTimer();
					System.out.println(btnLabel);
				}
			}
		});
		
		setLayout(new BorderLayout());
		add(timerPanel, BorderLayout.CENTER);
		add(btnsPanel, BorderLayout.SOUTH);
		
		pack();
		setMinimumSize(new Dimension(200, 100));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
	}
}

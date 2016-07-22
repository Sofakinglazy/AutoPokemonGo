package gui;

import java.awt.*;
import javax.swing.*;

import model.CursorPoints;

public class Mainframe extends JFrame{
		
	private ButtonPanel btnsPanel;
	private TimerPanel timerPanel;
	private CursorListener cursorListener;
	
	public Mainframe(){
		super("Auto Pokemon Go");
		
		btnsPanel = new ButtonPanel();
		timerPanel = new TimerPanel();
		cursorListener = new CursorListener();
		
		btnsPanel.setBtnListener(new ButtonListener() {
			public void clickBtn(String btnLabel) {
				if (btnLabel.equals("Start")){
					timerPanel.startTimer();
					timerPanel.setCursorPos(cursorListener.getCursorPoints());
				}
				if (btnLabel.equals("Record")){
					timerPanel.addMouseListener(cursorListener);
					System.out.println("here");
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

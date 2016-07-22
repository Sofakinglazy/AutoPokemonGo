package gui;

import java.awt.*;
import javax.swing.*;

import model.Point;


public class Mainframe extends JFrame{
		
	private ButtonPanel btnsPanel;
	private TimerPanel timerPanel;
	private CursorListener cursorListener;
	private CursorPosPanel cursorPosPanel;
	
	public Mainframe(){
		super("Pokemon Go Bot");
		
		btnsPanel = new ButtonPanel();
		timerPanel = new TimerPanel();
		cursorListener = new CursorListener();
		cursorPosPanel = new CursorPosPanel();
		
		btnsPanel.setBtnListener(new ButtonListener() {
			public void clickBtn(String btnLabel) {
				if (btnLabel.equals("Start")){
					timerPanel.startTimer();
					timerPanel.setCursorPos(cursorListener.getCursorPoints());
				}
				if (btnLabel.equals("Record")){
					cursorPosPanel.addMouseListener(cursorListener);
					System.out.println("Recording");
				}
			}
		});
		
		cursorListener.setCursorPosListener(new CursorPosListener() {
			public void pointEmitted(Point point) {
				cursorPosPanel.displayPoint(point);
			}
		});
		
		
		setLayout(new BorderLayout());
		add(timerPanel, BorderLayout.NORTH);
		add(btnsPanel, BorderLayout.SOUTH);
		add(cursorPosPanel, BorderLayout.CENTER);
		
		pack();
		setMinimumSize(new Dimension(300, 100));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
	}
}

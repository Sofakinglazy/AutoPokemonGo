package gui;

import java.awt.*;
import javax.swing.*;

import model.Point;


public class Mainframe extends JFrame{
		
	private ButtonPanel btnsPanel;
	private TimerPanel timerPanel;
	private CursorListener cursorListener;
	private CursorPosPanel cursorPosPanel;
	private ScreenCapturePanel screenShot;
	
	public Mainframe(){
		super("Pokemon Go Bot");
		
		btnsPanel = new ButtonPanel();
		timerPanel = new TimerPanel();
		cursorListener = new CursorListener();
		cursorPosPanel = new CursorPosPanel();
		screenShot = new ScreenCapturePanel();
		
		btnsPanel.setBtnListener(new ButtonListener() {
			public void clickBtn(String btnLabel) {
				if (btnLabel.equals("Start")){
					timerPanel.startTimer();
					timerPanel.setCursorPos(cursorListener.getCursorPoints());
				}
				if (btnLabel.equals("Record")){
					screenShot.addMouseListener(cursorListener);
					screenShot.updateBackground();
					screenShot.repaint();
					System.out.println("Recording");
				}
			}
		});
		
		cursorListener.setCursorPosListener(new CursorPosListener() {
			public void pointEmitted(Point point) {
				cursorPosPanel.displayPoint(point);
			}
		});
		
		
		setLayout(new GridLayout(4, 1));
		add(timerPanel);
		add(btnsPanel);
		add(cursorPosPanel);
		add(screenShot);
		
		pack();
		setMinimumSize(new Dimension(300, 100));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
	}
}

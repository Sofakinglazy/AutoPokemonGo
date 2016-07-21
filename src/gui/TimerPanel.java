package gui;

import javax.swing.*;
import model.TimeCounter;

public class TimerPanel extends JPanel{
	
	private JLabel timerLabel;
	private TimeCounter timer;
	private int min;
	private int sec;
	
	public TimerPanel(){
		timerLabel = new JLabel("05 : 00");
		timer = new TimeCounter(min, sec);
	}
}

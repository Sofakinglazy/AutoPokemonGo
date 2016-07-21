package gui;

import java.awt.Dimension;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class TimerPanel extends JPanel{
	
	private TimerLabel timerLabel;
	
	public TimerPanel(){
		timerLabel = new TimerLabel();
		
		Border raisedEtched = BorderFactory.createBevelBorder(EtchedBorder.RAISED);
		Border loweredEtched = BorderFactory.createBevelBorder(EtchedBorder.LOWERED);
		Border inside = BorderFactory.createCompoundBorder(raisedEtched, loweredEtched);
		Border outside = BorderFactory.createEmptyBorder(5, 10, 5, 10);
		setBorder(BorderFactory.createCompoundBorder(outside, inside));
		
		setPreferredSize(new Dimension(200, 50));
		add(timerLabel);
	}

	public void startTimer() {
		timerLabel.startTimer();
	}
}

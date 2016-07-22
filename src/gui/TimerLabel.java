package gui;

import java.awt.AWTException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import model.FarmPokestop;
import model.RecordCursor;

public class TimerLabel extends JLabel {

	public static long CONSTANT_TIME = 5 * 60 * 1000 / 60; // 5 mins 
	
	private long remainingTime;
	private String smins = "";
	private String ssecs = "";
	private Timer timer;
	private RecordCursor recordCursor;

	public TimerLabel() {

		setHorizontalAlignment(JLabel.CENTER);
		setVerticalAlignment(JLabel.CENTER);
		setFont(getFont().deriveFont(20f));
		
		timer = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				repaint();
				remainingTime -= 1000;
				if (remainingTime == 0){
					// reset timer and execute farming pokestops
					resetTimer();
					try {
						new Thread(new FarmPokestop(recordCursor)).start();
					} catch (AWTException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
	}
	
	private void resetTimer() {
		remainingTime = CONSTANT_TIME; 
	}

	public String formatTime() {
		int mins = (int) ((this.remainingTime / 60000) % 60);
		int secs = (int) ((this.remainingTime / 1000) % 60);

		if (mins < 10)
			smins = "0" + String.valueOf(mins);
		else
			smins = String.valueOf(mins);

		if (secs < 10)
			ssecs = "0" + String.valueOf(secs);
		else
			ssecs = String.valueOf(secs);

		return smins + ":" + ssecs;
	}

	@Override
	public String getText() {
		return formatTime();
	}

	public void startTimer() {
		resetTimer();
		timer.start();
	}

	public void setCursorPos(RecordCursor cursorPos) {
		this.recordCursor = cursorPos;
	}

}

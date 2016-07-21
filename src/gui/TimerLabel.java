package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TimerLabel extends JLabel {

	private long remainingTime;
	private String smins = "";
	private String ssecs = "";
	private Timer timer;

	public TimerLabel() {

		setHorizontalAlignment(JLabel.CENTER);
		setVerticalAlignment(JLabel.CENTER);
		setFont(getFont().deriveFont(20f));
		
		timer = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remainingTime -= 1000;
				repaint();
			}
		});
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
		remainingTime = 300000; 
		timer.start();
	}

}

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
		
		setLayout(new BorderLayout());
		add(timerPanel, BorderLayout.NORTH);
		add(btnsPanel, BorderLayout.SOUTH);
		
		pack();
		setMinimumSize(new Dimension(200, 150));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
	}
}

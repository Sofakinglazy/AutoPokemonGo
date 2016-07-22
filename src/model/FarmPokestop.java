package model;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class FarmPokestop implements Runnable {

	private Robot robot;
	private RecordCursor points;
	
	public FarmPokestop() throws AWTException {
		robot = new Robot();
		points = new RecordCursor();
		
		robot.mouseMove(400, 500);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseMove(500, 500);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}
	
	@Override
	public void run() {
		System.out.println("Farming Pokestops.");
		
	}

}

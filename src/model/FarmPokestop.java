package model;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class FarmPokestop implements Runnable {

	private Robot robot;
	private RecordCursor cursorPos;
	
	public FarmPokestop(RecordCursor cursorPos) throws AWTException {
		robot = new Robot();
		this.cursorPos = cursorPos;
		
		robot.mouseMove(400, 500);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseMove(500, 500);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}
	
	@Override
	public void run() {
		System.out.println("Farming Pokestops.");
		
		if (cursorPos == null) return;
		
		for (int i = 0; i < cursorPos.points.length; i++){
			if (cursorPos.points[i] != null){
				System.out.println(cursorPos.points[i]);
			}
		}
		
	}

}

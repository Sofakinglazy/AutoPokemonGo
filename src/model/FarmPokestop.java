package model;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class FarmPokestop implements Runnable {

	private Robot robot;
	private CursorPoints cursorPos;
	private Point[] swipePoints;
	private Point[] pokestopPoints;

	public FarmPokestop(CursorPoints cursorPoints) throws AWTException {
		robot = new Robot();
		this.cursorPos = cursorPoints;

		swipePoints = new Point[2];
		for (int i = 0; i < 2; i++) {
			swipePoints[i] = cursorPoints.points[i];
		}

		pokestopPoints = new Point[4];
		for (int i = 0; i < 4; i++) {
			pokestopPoints[i] = cursorPoints.points[2 + i];
		}

	}

	@Override
	public void run() {
		System.out.println("Farming Pokestops.");

		if (cursorPos == null)
			return;

		// click one pokestop
		for (int i = 0; i < pokestopPoints.length; i++) {
			if (pokestopPoints[i] == null) continue;
			
			robot.mouseMove(pokestopPoints[i].x, pokestopPoints[i].y);
			robot.mousePress(InputEvent.BUTTON1_MASK);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
			// wait until the pokestop shows up
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// swipe the pokestop
//			robot.mouseMove(swipePoints[0].x, swipePoints[0].y);
//			robot.mousePress(InputEvent.BUTTON1_MASK);
//			int newPosX = swipePoints[0].x;
//			int newPosY = swipePoints[0].y;
//			while (swipePoints[1].x > newPosX || swipePoints[1].y > newPosY){
//				if (swipePoints[1].x > newPosX)
//					newPosX++;
//				if (swipePoints[1].y > newPosY)
//					newPosY++;
//				robot.mouseMove(newPosX, newPosY);
//			}
//			robot.mouseMove(swipePoints[1].x, swipePoints[1].y);
//			robot.mouseRelease(InputEvent.BUTTON1_MASK);
			
			robot.keyPress(KeyEvent.VK_Q);
			
			// wait to get the items
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// click 'ESC' to exit the pokestop
			robot.keyPress(KeyEvent.VK_W);
			robot.keyRelease(KeyEvent.VK_W);
			// wait to 'ESC' the pokestop
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

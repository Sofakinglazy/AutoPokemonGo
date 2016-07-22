package gui;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import model.CursorPoints;

public class CursorListener implements MouseListener{
	
	private int posX;
	private int posY;
	private CursorPoints cursorPoints;
	
	public CursorListener() {
		cursorPoints = new CursorPoints();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// Get the absolute positions on the screen 
		posX = (int) MouseInfo.getPointerInfo().getLocation().getX();
		posY = (int) MouseInfo.getPointerInfo().getLocation().getY();
		System.out.println(posX + "," + posY);
		cursorPoints.addCursorPoint(new Point(posX, posY));
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
	
	public CursorPoints getCursorPoints(){
		return cursorPoints;
	}

}

package gui;

import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import model.CursorPoint;
import model.RecordCursor;

public class CursorListener implements MouseListener{
	
	private int posX;
	private int posY;
	private RecordCursor recordCursor;
	
	public CursorListener() {
		recordCursor = new RecordCursor();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		posX = (int) MouseInfo.getPointerInfo().getLocation().getX();
		posY = (int) MouseInfo.getPointerInfo().getLocation().getY();
		System.out.println(posX + "," + posY);
		recordCursor.addCursorPoint(new CursorPoint(posX, posY));
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
	
	public RecordCursor getCursorPos(){
		return recordCursor;
	}

}

package gui;

import java.awt.event.MouseListener;

public class ScreenCapturePanel extends Transparency{

	@Override
	public synchronized void addMouseListener(MouseListener l) {
		super.addMouseListener(l);
	}
	
}

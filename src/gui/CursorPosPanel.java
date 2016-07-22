package gui;

import java.awt.*;
import javax.swing.*;

import model.Point;

public class CursorPosPanel extends JPanel {

	public static String[] LABEL_TITLE = { "Swipe1: ", "Swipe2: ", "Stop1:   ", "Stop2:   ", "Stop3:   ", "Stop4:   " };

	private JLabel[] pointsLabel;
	private Point[] points;

	private String s;
	private int count;

	public CursorPosPanel() {
		super();
		setLayout(new GridLayout(3, 2));

		pointsLabel = new JLabel[LABEL_TITLE.length];
		points = new Point[LABEL_TITLE.length];
		for (int i = 0; i < LABEL_TITLE.length; i++) {
			pointsLabel[i] = new JLabel("", JLabel.CENTER);
			points[i] = new Point();
			s = LABEL_TITLE[i] + points[i];
			pointsLabel[i].setText(s);
			add(pointsLabel[i]);
		}

		count = 0;
	}

	public void displayPoint(Point point) {
		if (count < 6) {
			points[count] = point;
			updateLabel();
			count++;
		}

	}

	private void updateLabel() {
		s = LABEL_TITLE[count] + points[count];
		pointsLabel[count].setText(s);
		repaint();
	}
	

}

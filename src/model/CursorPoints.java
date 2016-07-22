package model;

public class CursorPoints {
	
	public Point[] points; 
	
	public CursorPoints(){
		points = new Point[6]; // two swipe points and 4 poke stops
	}
	
	public void addCursorPoint(Point cursorPoint) {
		for (int i = 0; i < 6; i++){
			if (points[i] == null){
				points[i] = cursorPoint;
				break;
			}
		}
	}

}

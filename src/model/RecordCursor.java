package model;


public class RecordCursor {
	
	public CursorPoint[] points;
	private boolean recording; 
	
	public RecordCursor(){
		stop();
		points = new CursorPoint[6]; // two swipe points and 4 poke stops
	}
	
	public void start(){
		recording = true;
	}
	
	public void stop(){
		recording = false;
	}

	public void addCursorPoint(CursorPoint cursorPoint) {
		for (int i = 0; i < 6; i++){
			if (points[i] == null){
				points[i] = cursorPoint;
				break;
			}
		}
	}

}

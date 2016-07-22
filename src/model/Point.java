package model;

public class Point extends java.awt.Point{

	public Point(int posX, int posY) {
		x = posX;
		y = posY;
	}

	public Point() {
		x = 0;
		y = 0;
	}

	public String toString(){
		return "[" + x + "," + y + "]";
	}
}

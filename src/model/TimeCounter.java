package model;

public class TimeCounter implements Runnable{

	private int min;
	private int sec;
	
	public TimeCounter(int min, int sec) {
		this.min = min;
		this.sec = sec;
	}

	@Override
	public void run() {
		
	}

}

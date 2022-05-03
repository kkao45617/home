package tv;

public class vcr {
	protected int counter;
	
	public void play() {}
	public void stop() {}
	public void reset() {counter=0;}
	public int getcounter() {return counter;}
	public void setcounter(int counter) {
		this.counter=counter;
	}
}

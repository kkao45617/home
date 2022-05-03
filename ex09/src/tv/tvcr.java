package tv;

public class tvcr extends tv implements ivcr {
	vcr vcr= new vcr();

	public static void main(String[] args) {
		tvcr tv= new tvcr();
		tv.play();
		tv.stop();
		tv.channeldown();
		System.out.println(tv.getcounter());
	}
	@Override
	public void play() {
		vcr.play();
	}

	@Override
	public void stop() {
		vcr.stop();
	}

	@Override
	public void reset() {
		vcr.reset();
	}

	@Override
	public int getcounter() {
		return vcr.getcounter();
	}

	@Override
	public void setcounter(int c) {
		vcr.setcounter(c);
	}
	
}

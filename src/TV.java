
public class TV {
	private int channel;
	private int volume;
	private boolean power;
	public TV(int channel,int volume,boolean power) {
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}
	public void status() {
		System.out.println(channel +", "+volume+", "+power);
	}
	public void power(boolean b) {
		power=b;
	}
	public void no() {
		System.out.println("불가능");
	}
	public void channel( int channel ) {
		if(channel<255 && channel>1)
			this.channel=channel;
		else
			no();
	}
	public void channel( boolean up) {
		if(up)
			channel++;
		else
			channel--;
		if(channel>255)
			channel=1;
		else if(channel<0)
			channel=255;
	}
	public void volume(int voluem) {
		if(volume<100 && volume>0)
			this.volume=volume;
		else
			no();
	}
	public void volume(boolean up) {
		if(up)
			volume++;
		else
			volume--;
		if(volume>100)
			volume=1;
		else if(volume<0)
			volume=100;
	}
}

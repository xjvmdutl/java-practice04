package prob03;

public class Unit  {
	private int x;
	private int y;
	void move(int x, int y) {
		/* 지정된 위치로 이동 */
		this.x=x;
		this.y=y;
		System.out.println("이동한다 : "+this.x+","+this.y);
	}

	void stop() {
		/* 현재 위치에 정지 */
		System.out.println("멈춘다");
	}	
}

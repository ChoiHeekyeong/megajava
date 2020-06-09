package 정적멤버;

public class Day {
	// 인스턴스 변수. = 매일매일 다르기때문. (전역변수)
	String doing;
	int time;
	String location;

	// 스태틱 변수 (전역변수)
	static int count;
	static int totalTime;

	public Day(String doing, int time, String location) {
		count++;
		totalTime += time; //totalTime = totalTime + time;
		this.doing = doing;
		this.time = time;
		this.location = location;

	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}

}

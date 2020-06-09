package 복습;

public class Tv {

	int channel; //멤버변수, 전역변수-> 자동초기화, 메소드영역에 생성.
	int volume;
	boolean onOff;
	
	static int count;//★★staic을 안붙이면 카운트가 제대로 안됨!!!!!!!!!!!!!!
	
	//생성자 오버로딩 = 입력값만 다르게 하면 메소드 이름을 동일하게 사용할 수 있다.
	public Tv(int channel, int volume, boolean onOff) {
		count++;
		//System.out.println("객체생성 개수는 "+count);
		this.channel = channel;
		this.volume = volume;
		this.onOff = onOff;
	}

	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + ", onOff=" + onOff + "]";
	}
	
	
	
}

package ����;

public class Tv {

	int channel; //�������, ��������-> �ڵ��ʱ�ȭ, �޼ҵ念���� ����.
	int volume;
	boolean onOff;
	
	static int count;//�ڡ�staic�� �Ⱥ��̸� ī��Ʈ�� ����� �ȵ�!!!!!!!!!!!!!!
	
	//������ �����ε� = �Է°��� �ٸ��� �ϸ� �޼ҵ� �̸��� �����ϰ� ����� �� �ִ�.
	public Tv(int channel, int volume, boolean onOff) {
		count++;
		//System.out.println("��ü���� ������ "+count);
		this.channel = channel;
		this.volume = volume;
		this.onOff = onOff;
	}

	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + ", onOff=" + onOff + "]";
	}
	
	
	
}

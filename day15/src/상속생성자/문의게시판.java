package ��ӻ�����;

public class ���ǰԽ��� extends �ϹݰԽ���{

	String reply;
	


	public ���ǰԽ���(int no, String title, String content, String writer, String reply) {
		//����Ŭ������ �Ķ���� ������
		//����Ŭ������ �����ڴ� �ݵ�� �ڽ�Ŭ���� ������ ù��!
		//�Ķ�����ִ� �����ڴ� ��������� ȣ��!
		super(no, title, content, writer);//���������.
		this.reply = reply;
	}


	@Override
	public String toString() {
		return "���ǰԽ��� [reply=" + reply + ", no=" + no + ", title=" + title + ", content=" + content + ", writer="
				+ writer + "]";
	}
	
	
}

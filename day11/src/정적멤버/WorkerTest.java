package �������;

public class WorkerTest {

	public static void main(String[] args) {

		Worker wk1 = new Worker("�Ӿƹ���","��",24);
		Worker wk2 = new Worker("��ƹ���","��",23);
		Worker wk3 = new Worker("�ھƹ���","��",25);
		
		System.out.println(wk1);
		System.out.println(wk2);
		System.out.println(wk3);
		
		
		System.out.println("��ü ���� ����: "+ Worker.countWorker);
		System.out.println("ù��° ������ �̸��� : "+wk1.name);
		System.out.println("�������� ��� ���̴�: "+(Worker.totalAge/Worker.countWorker));
		
		System.out.println("��ü ���� ����: "+Worker.getCountWorker());
		System.out.println("ù��° ������ �̸��� : "+wk1.getName());
		System.out.println("�������� ��� ���̴�: "+(Worker.getTotalAge()/Worker.getCountWorker()));
	}

}

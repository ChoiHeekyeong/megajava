package �������;

public class Worker {
	String name;
	String gender;
	int age;
	
	static int totalAge;
	static int countWorker;
	
	
	
	public Worker(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		
		totalAge += age;
		countWorker++;
		
	}

	
	//�ν��Ͻ� ������ ������ ���� ������ ����ϴ� ���!
	//��ü ���� ��, �Ϲ� �޼ҵ�� ȣ���Ͽ� ����� �� ����
	public String getName() {
		return name;
	}
	
	//����ƽ ������ ������ ���� ���� �� ����ϴ� ���!
	//����ƽ = ��ü������ ���ص� �޸𸮿� �ִ°�. => ��ü ������ ��� ���� Ŭ���� �̸����� �ٷ� �����Ͽ� ��� ����.
	//Ŭ�����̸�.����ƽ���� , Ŭ�����̸�.����ƽ�޼ҵ�..... <-�̷������� ���.
	//Worker.getTotalAge()
	public static int getTotalAge() {
		return totalAge;
	}
	public static int getCountWorker() {
		return countWorker;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Worker [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
	
	
	
	
	
	

}

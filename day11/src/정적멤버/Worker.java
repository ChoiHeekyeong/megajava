package 정적멤버;

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

	
	//인스턴스 변수를 가지고 오고 싶을때 사용하는 방법!
	//객체 생성 후, 일반 메소드는 호출하여 사용할 수 있음
	public String getName() {
		return name;
	}
	
	//스태틱 변수를 가지고 오고 싶을 때 사용하는 방법!
	//스태틱 = 객체생성을 안해도 메모리에 있는것. => 객체 생성과 상관 없이 클래스 이름으로 바로 접근하여 사용 가능.
	//클래스이름.스태틱변수 , 클래스이름.스태틱메소드..... <-이런식으로 사용.
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

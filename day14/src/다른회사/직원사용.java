package 다른회사;

import 우리회사.직원;

public class 직원사용 {

	public static void main(String[] args) {
		//컨트롤+시프트+o
		직원 e = new 직원();
		
		//가시성(visibility)이 퍼블릭인거만 다른패키지에서 보인다
		System.out.println(e.name);
//		System.out.println(e.address);
//		System.out.println(e.salary);
//		System.out.println(e.rrn);
		
		
	}

}

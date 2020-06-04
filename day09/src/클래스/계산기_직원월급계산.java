package 클래스;

public class 계산기_직원월급계산 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		
		//이번달 지불 금액
		int count = 5;//직원수
		int salary = 1000000;//월급
		
		int result1 = cal.mul(count,salary);
		
		
		
		//다음달 지불 금액
		int count2 = 8;
		int salary2=1200000;
		int result2 = cal.mul(count2, salary2);
		
		
		//두 달간 지불한 월급을 계산하고싶다.
		int result3 = cal.add(result1, result2);
		
		if (result3>=13000000) {
			System.out.println("지출이 너무 크군요.");
		}
		else {
			System.out.println("지출이 적당합니다.");
		}
		
		
		
		
	}

}

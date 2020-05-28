package 배열심화;

public class 배열복사응용_수학점수 {

	public static void main(String[] args) {
		int[] score1 = {100,88,96};
		int[] score2 = score1.clone();
		
		System.out.print("1학기 수학 점수: ");
		for (int i = 0; i < score2.length; i++) {
			System.out.print(score1[i]+" ");
		}
		System.out.println();
		
		//2학기 수학점수는 첫 학생만 100점에서 99점
		score2[0] = 99;
		
		//합계와 평균구하기
		int sum1 = 0;
		int sum2 = 0;
		double avg1 = 0;
		double avg2 = 0;
		for (int i = 0; i < score1.length; i++) {
			sum1 = sum1 + score1[i];
			sum2 = sum2 + score2[i];
		}
		avg1 = (double)sum1/score1.length;
		avg2 = (double)sum2/score2.length;
		
		System.out.println("1학기 수학 성적 합: "+sum1+", 1학기 수학 성적 평균: "+avg1);
		System.out.println("2학기 수학 성적 합: "+sum2+", 2학기 수학 성적 평균: "+avg2);
		
		
		
		if (avg1>avg2) {
			System.out.println("1학기 평균이 더 높음");
		}
		else if(avg2>avg1){
			System.out.println("2학기 평균이 더 높음");
			
		}
		else {
			System.out.println("두 학기 평균이 같다.");
		}
		
		
		
		
	}

}

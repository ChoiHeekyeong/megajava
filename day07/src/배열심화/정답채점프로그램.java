package 배열심화;

import java.util.Random;

public class 정답채점프로그램 {

	public static void main(String[] args) {
		//4지선다형.
		
		//정답 먼저 만들기
		int[] 정답 = new int[1000];
		Random r = new Random(42);
		for (int i = 0; i < 정답.length; i++) {
			정답[i] = r.nextInt(4)+1; //0~3이 아니라 1~4번이 나오게 해야함
		}
		
		for (int i = 0; i < 정답.length; i++) {
			System.out.println((i+1)+"번 문제 답: "+ 정답[i]);
		}
		
		
		System.out.println("============================");
		
		//학생의 일부 답안 랜덤으로 집어넣기
		int[] 학생 = 정답.clone();
		for (int i = 0; i < 300; i++) {
			int index = r.nextInt(300);
			int answer = r.nextInt(4)+1;
			학생[index] = answer;
			
		}
		
		//어떤 문항이 틀렸는지 찾고 문항과 정답/답안 비교출력
		int count = 0;
		for (int i = 0; i < 정답.length; i++) {
			if (정답[i] != 학생[i]) {
				System.out.println("틀린 문항 : "+(i+1)+"번 문제, 학생답: "+학생[i]+" / 정답: "+정답[i]);
				count++;
			}
			
		}
		
		
		//몇 개나 틀렸는지 찾기.
		System.out.println("틀린 문제 갯수: "+count);
		
		//점수 프린트 (개당 1점)
		System.out.println("학생의 점수: "+(정답.length-count)+"점");
		
		
		
	}

}

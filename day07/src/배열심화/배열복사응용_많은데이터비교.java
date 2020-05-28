package 배열심화;

import java.util.Random;

public class 배열복사응용_많은데이터비교 {

	public static void main(String[] args) {

		int[] score1 = new int[300];
		Random r = new Random(2);
		for (int i = 0; i < score1.length; i++) {
			score1[i] = r.nextInt(101);// 0~100
		}
		int[] score2 = score1.clone();
		// 2학기 점수를 일부 수정.
		score2[0] = 99;
		score2[1] = 42;
		score2[100] = 5;
		score2[200] = 87;
		score2[213] = 55;
		score2[255] = 65;

		for (int i = 0; i < score2.length; i++) {
			System.out.println("index " + i + ": " + score1[i] + "  " + score2[i]);
		}
		System.out.println();

		// 합계와 평균구하기
		int sum1 = 0;
		int sum2 = 0;
		double avg1 = 0;
		double avg2 = 0;
		for (int i = 0; i < score1.length; i++) {
			sum1 = sum1 + score1[i];
			sum2 = sum2 + score2[i];
		}
		avg1 = (double) sum1 / score1.length;
		avg2 = (double) sum2 / score2.length;

		System.out.println("1학기 수학 성적 합: " + sum1 + ", 1학기 수학 성적 평균: " + avg1);
		System.out.println("2학기 수학 성적 합: " + sum2 + ", 2학기 수학 성적 평균: " + avg2);

		if (avg1 > avg2) {
			System.out.println("1학기 평균이 더 높음");
		} else if (avg2 > avg1) {
			System.out.println("2학기 평균이 더 높음");

		} else {
			System.out.println("두 학기 평균이 같다.");
		}

		// 값이 다른 인덱스 찾기.
		int count =0;
		System.out.print("\n서로 값이 다른 index : ");
		for (int j = 0; j < score2.length; j++) {

			if (score1[j] != score2[j]) {
				System.out.print(j + " ");
				count++;
			}
			
		}
		
		System.out.println("\n"+count+"명이 다릅니다.");
	}

}

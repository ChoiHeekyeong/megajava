package 배열심화;

import java.util.Arrays;
import java.util.Random;

public class 만명중에1등찾기2 {

	public static void main(String[] args) {
		
		Random r = new Random(55);
		int[] student = new int[10000];
		for (int i = 0; i < student.length; i++) {
			student[i] = r.nextInt(401);//0~400점
		}
		
		//원본파괴를 하지 않고 최대값 찾기.
		
		int max = student[0]; //max를 우선 배열 첫번째 값으로 초기화
		//전체 점수를 돌면서
		//조건 체크: max에 넣어둔 값보다 큰가?
		//만약 max보다 크다면 max에 그 값을 넣는다.
		for (int i = 0; i < student.length; i++) {
			if(max < student[i]) {
				max = student[i];
			}
		}
		
		System.out.println("MAX = "+max);
		int count = 0;
		System.out.print("최고값을 가진 학생들: ");
		for (int i = 0; i < student.length; i++) {
			if (student[i] == max) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("max값을 가진 학생 수: "+count);
		
		
		
	}
		
		
}

package 배열심화;

import java.util.Arrays;
import java.util.Random;

public class 만명중에1등찾기 {

	public static void main(String[] args) {
		Random r = new Random(55);
		int[] student = new int[10000];
		for (int i = 0; i < student.length; i++) {
			student[i] = r.nextInt(401);//0~400점
		}
		
		//최대값 찾기
		Arrays.sort(student); //student를 솔트.(오름차순으로 정렬) //파괴형 함수.
		for (int x : student) {
			System.out.println(x);
			
		}
		
		System.out.println("최고점수는: "+student[9999]); //위에서 파괴형 함수를 썼으므로 배열원본이 바뀌어버림. 따라서 그냥 맨 마지막을 출력하면 가장 큰 숫자가 나온다.

		
		//Arrays.sort(student)를 쓰면 배열 원본이 파괴되어서 1등이 누구인지 찾을 수 없다.
		
	}

}

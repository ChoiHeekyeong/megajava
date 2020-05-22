package 반복문;

import java.util.Scanner;

public class 콘솔바로입력 {

	public static void main(String[] args) {
		
		
		//스캐너(입력용, file, 키보드, 네트워크,,,,,)
		//string--> int 명령어를 가지고있음
		Scanner sc = new Scanner(System.in);//어디에 입력할건지 ()안에 알려줘야함. 'System.in'=키보드.
		
		System.out.print("당신의 나이를 입력해주세요>> ");
		int age = sc.nextInt();//내가 수동으로 안바꿔도 자동으로 int로 바꿔서 입력들어옴.
		
		System.out.println("당신의 나이는 "+age+"세.");
		System.out.println("당신의 내년 나이는 "+(age+1)+"세.");
		

	}

}

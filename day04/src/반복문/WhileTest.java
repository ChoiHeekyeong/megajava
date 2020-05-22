package 반복문;

import javax.swing.JOptionPane;

public class WhileTest {
	public static void main(String[] args) {

		
		int count=10;
		while (count<16) {
			System.out.println(count);
			count++;
			//count = count+1;
		}
		
		System.out.println("------------------------");
		
		
		while(true) {
			String hour = JOptionPane.showInputDialog("지금 몇시예요? (종료: x)");
			//x를 눌렀는지 확인해야함.
			//x를 눌렀으면, 그만 반복문을 끝내고 싶다.
			if(hour.equals("x")) {
				System.out.println("시스템을 종료합니다.");
				break;
				
			}
			System.out.println(hour+"시 입니다");//+<----결합연산자 (하나라도 스트링을 끼고있으면.)
		}
		
		
		
		
		
		
	}

}

package 순차문;

import java.util.Date;

import javax.swing.JOptionPane;

public class 집에갈시간 {

	public static void main(String[] args) {
		
		//시간을 구해주는 클래스
		//Date, Calendar
		//C드라이브에있는 라이브러리로부터 복사한다는 키워드 = new
		Date date = new Date(); //c드라이브에 있는 Date()를 Date date에 넣는다는 뜻!
		
		int time = date.getHours();
		System.out.println(date.getSeconds());
		
		
		if(time>=22) {
			JOptionPane.showMessageDialog(null, "집에 갈 시간이 얼마 안남음.");
		}
		else {
			JOptionPane.showMessageDialog(null, "집에 갈 시간이 많이 남음");
		}
		
		
	}

}

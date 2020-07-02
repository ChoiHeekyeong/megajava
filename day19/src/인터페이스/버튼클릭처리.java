package 인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 버튼클릭처리 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource()); //어떤 버튼을 눌렀는지 알 수 있음!
		
			
		
		System.out.println("버튼을 눌렀음");
	}

}

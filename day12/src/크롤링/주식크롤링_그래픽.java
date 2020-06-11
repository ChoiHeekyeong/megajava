package 크롤링;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 주식크롤링_그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 주식 크롤링");
		f.setSize(420,800);
		
		FlowLayout flow = new FlowLayout();
		
		JButton b1 = new JButton("셀트리온");
		JButton b2 = new JButton("삼성전자");
		JButton b3 = new JButton("현대약품");
		JButton b4 = new JButton("크롤링 시작");
		
		JLabel l = new JLabel("CODE:");
		JTextField input = new JTextField(8);//8글자만큼 넣을래 (크기조정)
		JTextArea result = new JTextArea(5,8); //5줄 8글자정도 (크기조정)
		
		Font font = new Font("궁서",1,50);
		Font font2 = new Font("궁서",1,40);
		f.setLayout(flow);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		l.setFont(font);
		input.setFont(font);
		result.setFont(font2);
		
		b1.setBackground(Color.orange);
		b2.setBackground(Color.orange);
		b3.setBackground(Color.orange);
		l.setForeground(Color.red);
		input.setBackground(Color.yellow);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l);
		f.add(input);
		f.add(b4);
		f.add(result);
		
		//frame에 뭔가 꾸며주기위해 필요한것: .getContentPane()
		f.getContentPane().setBackground(Color.pink);
		
		
		//result.setEditable(false); 
		result.setEnabled(false);//textArea에 글자를 칠 수 없게 하는 기능
		
		
		
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(""); //눌렀을때 textarea에 있는 내용을 다 지워줌
				String data = "068270";
				주식크롤링_그래픽_모듈함수 네이버 = new 주식크롤링_그래픽_모듈함수();
				String[] values = 네이버.naver(data); //naver함수에서 리턴한 값을 대입.
				result.append("현재가: "+ values[0]+"\n");
				result.append("고가: "+ values[1]+"\n");
				result.append("저가: "+ values[2]+"\n");
				//append를 써야 덮어쓰질 않음. setText는 덮어쓴다. append를 쓰면 그 밑에 쫙 써짐.
				
				
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(""); //눌렀을때 textarea에 있는 내용을 다 지워줌
				String data = "005930";
				주식크롤링_그래픽_모듈함수 네이버 = new 주식크롤링_그래픽_모듈함수();
				String[] values = 네이버.naver(data); //naver함수에서 리턴한 값을 대입.
				result.append("현재가: "+ values[0]+"\n");
				result.append("고가: "+ values[1]+"\n");
				result.append("저가: "+ values[2]+"\n");
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(""); //눌렀을때 textarea에 있는 내용을 다 지워줌
				String data = "004310";
				주식크롤링_그래픽_모듈함수 네이버 = new 주식크롤링_그래픽_모듈함수();
				String[] values = 네이버.naver(data); //naver함수에서 리턴한 값을 대입.
				result.append("현재가: "+ values[0]+"\n");
				result.append("고가: "+ values[1]+"\n");
				result.append("저가: "+ values[2]+"\n");
			}
		});
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(""); //눌렀을때 textarea에 있는 내용을 다 지워줌
				String data = input.getText(); //텍스트필드에서 받은 값을 가져옴.
				주식크롤링_그래픽_모듈함수 네이버 = new 주식크롤링_그래픽_모듈함수();
				String[] values = 네이버.naver(data); //naver함수에서 리턴한 값을 대입.
				result.append("현재가: "+ values[0]+"\n");
				result.append("고가: "+ values[1]+"\n");
				result.append("저가: "+ values[2]+"\n");
			}
		});
		
		
		
		
		
		f.setVisible(true);
		
		
		
		
		
		
	}

}

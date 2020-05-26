package 배열;


public class 값을모르고있는경우3 {

	public static void main(String[] args) {
		String[] names = new String[21];
		names[0] = "홍길동";
		names[1] = "김길동";
		names[5] = "박길동";
		names[8] = "정길동";
		names[15] = "송길동";
		names[19] = "이길동";
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(i+": "+names[i]);
			//String은 참조형이기때문에 값이 없는건 null이 들어감. 주소가 없다는 뜻.
		}
		
		
		
		
		
		
		
		
		
		
	}

}

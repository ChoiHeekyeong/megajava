package 배열;

public class 값을알고있는경우 {

	public static void main(String[] args) {
		String[] names = {"김길동","홍길동","박길동"};
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]+" ");
		}
		System.out.println();
		
		//for each문
		for (String s : names) {//s: 임시변수
			System.out.print(s+" ");
		}
		System.out.println();
		
		
		
		char[] gender = {'남','여','남'};
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i]+" ");
		}
		System.out.println();
		//for each
		for (char c : gender) {
			System.out.print(c+" ");
		}
		System.out.println();
		
		
		
		int[] ages = {100,25,11};
		for (int i = 0; i < ages.length; i++) {
			System.out.print(ages[i]+" ");
		}
		System.out.println();
		//for each
		for (int i : ages) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		double[] height = {187.3,154.2,140};
		for (int i = 0; i < height.length; i++) {
			System.out.print(height[i]+" ");
		}
		System.out.println();
		//for each
		for (double d : height) {
			System.out.print(d+" ");
		}
		
		
		
		
		
		
		
		
	}

}

package looping;

public class WhileReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5432;
		int reverse = 0;
		while (a != 0) {
			int b = a % 10;
			reverse = (reverse * 10) + b;
			a = a / 10;
		}
		System.out.println("reverse number" + reverse);

	}

}

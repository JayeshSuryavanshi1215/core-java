package looping;

public class ForloopSquareseries {
	void square() {
		// 1 2 4 8 16 32 64

		for (int i = 1; i <= 64; i = i * 2) {
			System.out.print(i + " ");
		}
	}

	void series() {
		// 1 4 7 10 13 16 19 22
		for (int i = 1; i <= 22; i = i + 3) {
			System.out.print(i + " ");
		}
	}

	void squareseries2() {
		// 1 4 9 16 25 36
		for (int i = 1; i <= 6; i++) {
			System.out.print((i * i) + "  ");
		}
	}

	void series2() {
		// 1 2 6 15 31 56
		int x = 1;
		for (int i = 1; i <= 56;) {
			System.out.print(i + "  ");
			i = i + (x * x);
			x++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForloopSquareseries obj = new ForloopSquareseries();
		obj.square();
		System.out.println("\n----------------");
		obj.series();
		System.out.println("\n----------------");
		obj.squareseries2();
		System.out.println("\n----------------");
		obj.series2();
	}

}

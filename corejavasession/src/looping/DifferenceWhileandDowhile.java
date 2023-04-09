package looping;

public class DifferenceWhileandDowhile {
	void whiledemo() {
		int s = 2;
		while (s <= 5) {
			System.out.println(s + "");
			s++;

		}
		System.out.println("done");
	}

	void dowhiledemo() {
		int s = 7;
		do {
			System.out.println(s + "");
			s++;
		} while (s <= 5);
		System.out.println("done");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DifferenceWhileandDowhile obj = new DifferenceWhileandDowhile();
		obj.dowhiledemo();
	}

}

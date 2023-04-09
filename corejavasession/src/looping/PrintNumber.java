package looping;

import java.util.Scanner;

public class PrintNumber {
	void printing() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting point");
		int a = sc.nextInt();
		System.out.println("Enter ending point");
		int b = sc.nextInt();
		//System.out.println("Number are even");
		while (a <= b) {
			if (a % 2 == 0) {
				System.out.println(a + "");
			}
			a++;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumber obj = new PrintNumber();
		obj.printing();

	}

}

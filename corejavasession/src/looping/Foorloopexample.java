package looping;

import java.util.Scanner;

public class Foorloopexample {
	void printNumberForword() {
		int i, end = 5;

		for (i = 1; i <= end; i++) {
			System.out.println(i + "");
		}
		System.out.println("done");
	}

	void printNumberReverse() {
		for (int i = 10; i >= 1; i--) {
			System.out.println(i + "");
		}
		System.out.println("done");
	}

	void factorial() {
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("factorial is" + fact);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Foorloopexample obj = new Foorloopexample();
		System.out.println("1..forword point");
		System.out.println("2..reverse point");
		System.out.println("3..factorial point");
		System.out.println("enter the choice:");
		int ch;
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			obj.printNumberForword();
			break;
		case 2:
			obj.printNumberReverse();
		case 3:
			obj.factorial();

		}

	}

}

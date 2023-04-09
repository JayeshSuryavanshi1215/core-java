package looping;

import java.util.Scanner;

public class Additionofevenoroddnumber {
	void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the starting point");
		int a = sc.nextInt();
		System.out.println("enter the ending point");
		int b = sc.nextInt();
		System.out.println("");
		int even = 0;
		int odd = 0;
		while (a <= b) {
			if (a % 2 == 0) {
				even = even + a;
			} else {
				odd = odd + a;
			}
			a++;
		}
		System.out.println(" addition of even number" + even);
		System.out.println(" addition of odd number" + odd);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Additionofevenoroddnumber obj = new Additionofevenoroddnumber();
		obj.add();

	}

}

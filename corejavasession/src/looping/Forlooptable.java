package looping;

import java.util.Scanner;

public class Forlooptable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter the number");
		int b = sc.nextInt();
		for (i = 1; i <= 10; i++) {
			System.out.println(b + "*" + i + "=" + i);
		}

	}

}

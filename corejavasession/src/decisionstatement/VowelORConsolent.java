package decisionstatement;

import java.util.Scanner;

public class VowelORConsolent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		ch = sc.next().charAt(0);
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println("Alphabet is vowel");

		} else {
			System.out.println("Alphabet is consolent");
		}

	}

}

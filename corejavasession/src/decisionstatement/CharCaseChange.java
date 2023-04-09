package decisionstatement;

import java.util.Scanner;

public class CharCaseChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter the alphabet");
		ch = sc.next().charAt(0);
		if (ch >= 'a' && ch <= 'z') {
			int i = ch - 32;
			System.out.println((char) i);
		} else if (ch >= 'A' && ch <= 'Z') {
			int i = ch + 32;
			System.out.println((char) i);
		} else {
			System.out.println("please enter the input....");
		}

	}

}

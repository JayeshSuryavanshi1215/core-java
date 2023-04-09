package decisionstatement;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter the Percentage");
		a = sc.nextInt();

		if (a >= 70) {
			System.out.println("Student are distinction");
		} else if (a >= 60) {
			System.out.println("Student are first class");

		} else if (a >= 50) {
			System.out.println("Student are second class");
		} else if (a >= 35) {
			System.out.println("Student are pass ");
		} else {
			System.out.println("Student are fail");
		}

	}

}

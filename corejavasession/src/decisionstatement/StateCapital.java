package decisionstatement;

import java.util.Scanner;

public class StateCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the state name:");
		String state = sc.nextLine();
		state = state.toLowerCase();
		switch (state) {
		case "maharashtra":
			System.out.println("Mumbai");
			break;
		case "gujrat":
			System.out.println("Gandhinagar");
			break;
		case "madhya pradesh":
			System.out.println("Bhopal");
			break;
		case "goa":
			System.out.println("Panji");
			break;
		case "karnaaka":
			System.out.println("Bangalore");
			break;
		default:
			System.out.println("Enter the valid state");
			break;

		}

	}

}

package decisionstatement;

import java.util.Scanner;

public class CalculateJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("1.Addition");
		System.out.println("2. Multiplication");
		System.out.println("3. Division \n4. square");
		System.out.println("Enter your choice:");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("Addition is:" + (a + b));
			break;
		case 2:
			System.out.println("Multiplication:" + (a * b));
			break;
		case 3:
			System.out.println("Division:" + (a / b));
			break;
		case 4:
			System.out.println("Square of" + a + "=" + (a * a) + "square of" + b + "=" + (b * b));
			break;
		default:
			System.out.println("please enter valid option.....");

		}
	}

}

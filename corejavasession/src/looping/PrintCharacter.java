package looping;

import java.util.Scanner;

public class PrintCharacter {
	void Character() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the start  charecter");
		char a = sc.next().charAt(0);
		System.out.println(" enter the end character");
		char z = sc.next().charAt(0);

		while (a <= z) {
			System.out.println(a);
			a++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintCharacter obj = new PrintCharacter();
		obj.Character();

	}

}

package looping;

import java.util.Scanner;

public class ReverseCharacter {
	void reverse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the start point alphabet");
		char a = sc.next().charAt(0);
		System.out.println("enter the end point alphabet");
		char z = sc.next().charAt(0);
		System.out.println("reverse character");
		while (a >= z) {
			System.out.println(a);
			a--;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseCharacter obj = new ReverseCharacter();
		obj.reverse();

	}

}

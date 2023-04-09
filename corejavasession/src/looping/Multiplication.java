package looping;

import java.util.Scanner;

public class Multiplication {
	void mul() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the starting point");
		int a = sc.nextInt();
		System.out.println("enter the end point");
		int b = sc.nextInt();
		
		
		int mul = 1;
		while (a <= b) {
			System.out.println(a);
			mul = mul * a;
			a++;
		}
		System.out.println("multiplication="+mul);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplication obj = new Multiplication();
		obj.mul();

	}

}

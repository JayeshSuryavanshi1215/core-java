package looping;

import java.util.Scanner;

public class ReverseNumber {
	void reverse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the ending point");
		int a = sc.nextInt();
		System.out.println("enter the starting point");
		int b = sc.nextInt();
		System.out.println("reverse number");
		while (a >= b) {
			System.out.println(a);
			a--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// classname ref_var_name=new class name();
		ReverseNumber obj = new ReverseNumber();
		// class_obj.method_name
		obj.reverse();

	}

}

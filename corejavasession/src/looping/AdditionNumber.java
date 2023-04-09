package looping;

import java.util.Scanner;

public class AdditionNumber {
	void addNum() {// 1to6 1+
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Start point:");
		int s = sc.nextInt();
		System.out.println("Enter the end point");
		int e = sc.nextInt();
		int add = 0;
		while (s <= e) {
			add = add + s;
			s++;
		}
		System.out.println("Addition is:" + add);
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// classname ref_var_name=new class name();
		AdditionNumber obj = new AdditionNumber();
		// class_obj.method_name
		obj.addNum();

	}

}

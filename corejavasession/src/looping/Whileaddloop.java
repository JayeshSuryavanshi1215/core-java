package looping;

public class Whileaddloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5432, add = 0; 
		while (a != 0) { // a=5432          a=543     a=54   a=5             a=0
							// t            t           t     t              f
			int b = a % 10; // b=5432%10=2   543%10=3  54%10=4  5%10=5

			add = add + b; // add=0+2=2     add=2+3=5  add= 5+4=9  add=9+5=14
			
			a = a / 10; // 5432/10=543      543/10=54    54/10=5    5/10=0
		}
		System.out.println("Addition" + add);
	}

}

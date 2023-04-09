package looping;

public class Whilemaxminnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 15432, max = num % 10, min = num % 10;
		while (num != 0) { //     num=15432     num=1543           num=154          num=15       num=1    num=0
                            
			int r = num % 10; // r=15432%10=2   r=1543%10=3         r=154%10=4      r=15%10=5   r=1%10=1    f
			if (r > max) {   //   f                t                      t            t          f

				max = r;   //                     max=3                 max=4        max=5
			}
			if (r < min) { //   f                  f                     f            f             t
				min = r;  //                                                                      min=1
			}
			num = num / 10;  // 15432/10=1543     1543/10=154         154/10=15   15/10=1        1/10=0

		}
		System.out.println("Max digit:" + max);
		System.out.println("min digit:" + min);
	}

}

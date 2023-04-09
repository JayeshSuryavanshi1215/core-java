package corejavasession;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int english = 80;
		int marathi = 56;
		int maths = 90;
		int chemistry = 67;
		int total = (english + marathi + maths + chemistry);
		double percentage = (total * 100 / 500);
		System.out.println("total =>" + total);
		System.out.println("percentage=>" + percentage);
	}

}

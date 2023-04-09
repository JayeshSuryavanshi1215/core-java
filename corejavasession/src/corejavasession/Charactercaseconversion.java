package corejavasession;

public class Charactercaseconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';// a=97 A=65 small to capital ==-32(exclipt type cast)
		int i = ch - 32; // i=97-32=65
		System.out.println((char) i);

		char j = 'M'; // (ji konti value asel tycha difference ha 32 asto)
		int k = j + 32;
		System.out.println((char) k);

	}

}

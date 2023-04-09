package assignment;

public class Convertmeterandkilometer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double l = 12.3, meter, kilometer;
		meter = l / 100; // (l=cm) meter=cm/10
		kilometer = l / 100000; // (l=cm) kilometer
		System.out.println("meter=>" + meter);
		System.out.println("kilometer=>" + kilometer);
	}

}

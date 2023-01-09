
import java.util.Scanner;

public class GrassSeedInc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		double c = scan.nextDouble(); // cost of seed for 1 sqr meter
		double l = scan.nextDouble(); // number of lawns to sow
		double total = 0;
		double tmpTotal = 0;

		for (int i = 0; i < l; i++) {
			double w = scan.nextDouble(); // width of lawn
			double len = scan.nextDouble(); // length of lawn
			total += ((w * len) * c);

		}
		System.out.printf("%.7f", total);
	}

}

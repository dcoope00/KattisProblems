
import java.util.Scanner;

public class SevenWonders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		int tCount = 0;
		int cCount = 0;
		int gCount = 0;
		double result = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'T')
				tCount++;
			if (str.charAt(i) == 'C')
				cCount++;
			if (str.charAt(i) == 'G')
				gCount++;

		}
		for (int i = 0; i < str.length(); i++) {
			if (tCount > i && gCount > i && cCount > i) {
				result += 7;

			}
		}

		result += (Math.pow(tCount, 2)) + (Math.pow(cCount, 2)) + (Math.pow(gCount, 2));

		System.out.println((int) result);
	}

}

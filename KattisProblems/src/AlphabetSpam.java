
import java.util.Scanner;

public class AlphabetSpam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int count = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < str.length(); j++) {
				if (i == 0) {
					if (str.charAt(j) == '_') {
						count++;
					}
				}
				if (i == 1) {

					if (Character.isLowerCase(str.charAt(j))) {
						count2++;
					}
				}
				if (i == 2) {
					if (Character.isUpperCase(str.charAt(j))) {
						count3++;
					}
				}
				if (i == 3) {
					if (!Character.isAlphabetic(str.charAt(j)) && str.charAt(j) != '_') {
						count4++;

					}
				}
			}

		}
		System.out.printf("%.15f", count / (double) str.length());
		System.out.println();
		System.out.printf("%.15f", count2 / (double) str.length());
		System.out.println();
		System.out.printf("%.15f", count3 / (double) str.length());
		System.out.println();
		System.out.printf("%.15f", count4 / (double) str.length());
	}

}
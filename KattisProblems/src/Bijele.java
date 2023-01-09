import java.util.Scanner;

public class Bijele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int[] pieces = new int[6];
		int[] fullSet = new int[6];
		fullSet[0] = 1;
		fullSet[1] = 1;
		fullSet[2] = 2;
		fullSet[3] = 2;
		fullSet[4] = 2;
		fullSet[5] = 8;

		for (int i = 0; i < pieces.length; i++) {
			pieces[i] = scan.nextInt();
		}

		for (int i = 0; i < pieces.length; i++) {
			int diff = fullSet[i] - pieces[i];
			System.out.println(diff);
		}
	}

}

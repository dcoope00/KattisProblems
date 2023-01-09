import java.util.Scanner;

public class EncodedMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		scan.nextLine();
		String[][] array = new String[0][0];
		while (n-- > 0) {

			String str = scan.nextLine();

			int len = str.length();
			int dim = (int) Math.sqrt(len);
			int count = 0;

			array = new String[dim][dim];
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					array[i][j] = str.charAt(count) + "";
					count++;

				}
			}

			for (int i = array.length - 1; i >= 0; i--) {
				for (int j = 0; j < array.length; j++) {
					System.out.print(array[j][i]);

				}
			}
			System.out.println();

		}

	}

}
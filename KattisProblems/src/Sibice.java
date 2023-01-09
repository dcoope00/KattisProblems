import java.util.Scanner;

public class Sibice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] > Math.sqrt((w * w) + (h * h))) {
				System.out.println("NE");
			} else
				System.out.println("DA");
		}

	}

}

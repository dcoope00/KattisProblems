import java.util.Scanner;

public class ElectricalOutlets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // # of test cases
		int apps = 1;
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			apps = 1;
			int k = scan.nextInt(); // # of pwer strips
			for (int j = 0; j < k; j++) {
				int l = scan.nextInt(); // number of outlets in each pwer strip
				if (j < k) {
					l = l - 1;
					apps += l;
					array[i] = apps;
				}

			}

		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}

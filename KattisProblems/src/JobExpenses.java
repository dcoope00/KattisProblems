
import java.util.Scanner;

public class JobExpenses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] array = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0)
				sum -= array[i];

		}
		System.out.println(sum);
	}

}

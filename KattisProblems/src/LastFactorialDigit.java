import java.util.ArrayList;
import java.util.Scanner;

public class LastFactorialDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int tmp = 0;
		int fact = 1;
		int num = 0;
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			tmp = scan.nextInt();
			for (int j = tmp; j > 0; j--) {
				fact *= j;

			}
			num = fact % 10;
			list.add(num);
			fact = 1;

		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}

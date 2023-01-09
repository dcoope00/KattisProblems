
import java.util.ArrayList;
import java.util.Scanner;

public class Zamka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int d = scan.nextInt();
		int x = scan.nextInt();

		int n = 0;
		int m = 0;
		int xSum = 0;
		int tmp = 0;
		int tmp2 = 0;
		int count = l;
		int count2 = 0;

		for (int i = l; i <= d; i++) {
			xSum = 0;
			count = i;
			while (count > 0) {
				tmp = count % 10;
				xSum += tmp;
				count = count / 10;
			}

			count++;
			if (xSum == x && count2 == 0) {
				n = i;
				count2++;
			}
			if (xSum == x && i <= d) {
				m = i;
			}

		}
		System.out.println(n);
		System.out.println(m);

	}

}

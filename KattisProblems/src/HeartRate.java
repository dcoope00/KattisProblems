import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class HeartRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt(); // # of cases to follow
		double[] array1 = new double[n];
		double[] array2 = new double[n];
		int count = 0;
		double d1 = 0;
		double d2 = 0;
		for (int i = 0; i < n; i++) {
			d1 = scan.nextDouble();
			d2 = scan.nextDouble();
			array1[i] = d1;
			array2[i] = d2;
		}
		while (n > 0) {

			double ans = 60 * (array1[count] / array2[count]);
			double var = 60 / array2[count];
			System.out.printf("%.4f ", ans - var);
			System.out.printf("%.4f ", ans);
			System.out.printf("%.4f", ans + var);
			System.out.println();
			n--;
			count++;
		}

	}
}
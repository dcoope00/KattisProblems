
import java.util.ArrayList;
import java.util.Scanner;

public class TaisFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		double tmpSum = 0;
		double tmpDiff = 0;
		double result = 0;
		ArrayList<Integer> times = new ArrayList<>();
		ArrayList<Double> values = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int t = scan.nextInt(); // time of sample
			double v = scan.nextDouble(); // glucose value
			times.add(t);
			values.add(v);

		}

		for (int i = 0; i < times.size() - 1; i++) {

			tmpSum += values.get(i) + values.get(i + 1);
			tmpSum /= 2;
			tmpDiff = times.get(i + 1) - times.get(i);
			result += tmpSum * tmpDiff;
			tmpSum = 0;
			tmpDiff = 0;

		}

		System.out.println(result / 1000);

	}

}
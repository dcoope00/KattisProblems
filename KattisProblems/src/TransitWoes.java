import java.util.Scanner;

public class TransitWoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt(); // time he leaves his house
		int t = scan.nextInt();// first class starts
		int n = scan.nextInt();

		int[] array = new int[n + 1]; // time it takes to walk from i-th bus drop off point to the i+1-th bus stop
		int[] array2 = new int[n];// amount of time he rides the i-th bus
		int[] array3 = new int[n];// intervals the i-th bus arrives
		int sum = 0;
		int sum2 = 0;

		for (int i = 0; i < n + 1; i++) {
			array[i] = scan.nextInt();
		}

		for (int i = 0; i < n; i++) {
			array2[i] = scan.nextInt();
		}

		for (int i = 0; i < n; i++) {
			array3[i] = scan.nextInt();
		}

		for (int i = 0; i < n; i++) {
			sum += array[i];
			sum2 += array2[i];
		}

		if (sum + sum2 + array3[0] < t) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
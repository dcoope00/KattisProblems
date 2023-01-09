
import java.util.Scanner;

public class Pot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int tmp = 0;
		int power = 0;
		double numAndPower = 0;
		double answer = 0;
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			power = array[i] % 10;
			tmp = array[i] / 10;
			numAndPower = Math.pow(tmp, power);
			answer += numAndPower;
		}
		System.out.println((int) answer);
	}

}
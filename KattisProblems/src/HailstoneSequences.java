import java.util.ArrayList;
import java.util.Scanner;

public class HailstoneSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();

		ArrayList<Long> sequence = new ArrayList<>();
		if (n == 1) {
			sequence.add((long) 1);
		} else {
			sequence.add(n);
			long lastNum = n;
			while (true) {
				
				if (lastNum % 2 == 0) {
					sequence.add(lastNum / 2);
					lastNum = lastNum / 2;
				} else {
					sequence.add(3 * (lastNum) + 1);
					lastNum = 3 * (lastNum) + 1;
				}
				if (sequence.get(sequence.size() - 1) == 1) {
					break;
				}

			}
		}
		System.out.println(sequence.size());

	}

}

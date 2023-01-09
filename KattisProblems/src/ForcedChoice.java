
import java.util.ArrayList;
import java.util.Scanner;

public class ForcedChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt(); // # of cards
		int p = scan.nextInt(); // secret prediction
		int s = scan.nextInt(); // number of steps
		ArrayList<Integer> list = new ArrayList<>();
		String[] array = new String[s];
		for (int i = 0; i < s; i++) {
			int m = scan.nextInt(); // # of cards chosen
			for (int j = 0; j < m; j++) {
				int l = scan.nextInt(); // card labels
				list.add(l);
			}
			if (list.contains(p)) {
				array[i] = "KEEP";
			} else {
				array[i] = ("REMOVE");
			}
			list.clear();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
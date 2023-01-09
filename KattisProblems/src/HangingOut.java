
import java.util.Scanner;

public class HangingOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String nums = scan.nextLine();
		String[] numsToUse = nums.split(" ");
		int lim = Integer.parseInt(numsToUse[0]);
		int numEvents = Integer.parseInt(numsToUse[1]);

		int cant = 0;
		int tempTotal = 0;

		for (int i = 0; i < numEvents; i++) {
			String temp = scan.nextLine();
			String[] tempArray = temp.split(" ");
			String entry = tempArray[0];
			int num = Integer.parseInt(tempArray[1]);

			if (entry.equals("enter")) {
				tempTotal += num;
				if (tempTotal > lim) {
					cant++;
					tempTotal -= num;
				}
			} else {
				tempTotal -= num;

			}

		}
		System.out.println(cant);

	}

}
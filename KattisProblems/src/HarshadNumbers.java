
import java.util.Scanner;

public class HarshadNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int nHolder = n;
		int nHolder2 = 0;
		boolean hNum = false;
		double isEven = 0;
		double digitSum = 0;
		double tmp = 0;

		while (hNum == false) {
			nHolder2 = nHolder;
			for (int i = 0; nHolder > 0; i++) {
				tmp = nHolder % 10;
				digitSum += tmp;
				nHolder /= 10;

			}
			nHolder = nHolder2;

			n = nHolder;

			if ((nHolder / digitSum) % 1 == 0) {
				hNum = true;
			} else if ((nHolder / digitSum) % 1 != 0) {
				hNum = false;
			}

			if (hNum == true) {
				System.out.println(nHolder);
			} else if (hNum == false) {
				nHolder++;
				digitSum = 0;
				tmp = 0;
			}
		}
	}

}
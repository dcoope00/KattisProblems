import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		int count = 0;
		int dashCounter = 0;

		String[] array = str.split(";");

		for (int i = 0; i < array.length; i++) {
			if (array[i].contains("-")) {
				dashCounter++;
				String[] strTmp = array[i].split("-");
				int tmp = Integer.parseInt(strTmp[0]);

				while (tmp != Integer.parseInt(strTmp[1])) {
					tmp++;
					count++;

				}
			} else {
				count++;
			}

		}
		System.out.println(count + dashCounter);

	}

}
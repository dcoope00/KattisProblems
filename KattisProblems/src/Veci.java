import java.util.ArrayList;
import java.util.Scanner;

public class Veci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String number = n + "";
		int res = n;
		ArrayList<Integer> list = new ArrayList<>();

		while (n > 0) {
			int temp = n % 10;
			n /= 10;
			list.add(temp);

		}
		String maxNum = "";
		for (int i = 0; i < list.size(); i++) {
			maxNum += "9";

		}
		n = res;
		int answer = 0;
		int max = Integer.parseInt(maxNum);
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int i = n + 1; i <= max; i++) {
			String str = i + "";
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
					if (number.contains(str.charAt(j) + "")) {
						count++;
						number = number.replaceFirst(str.charAt(j) + "", "");
					}
				

			}
			if (count == str.length()) {
				answer = i;
				break;
			} else {
				number = res + "";
			}

		}
		System.out.println(answer);
	

	}
}

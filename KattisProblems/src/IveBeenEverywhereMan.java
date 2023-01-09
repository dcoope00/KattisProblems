
import java.util.ArrayList;
import java.util.Scanner;

public class IveBeenEverywhereMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> finList = new ArrayList<>();
		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			for (int j = 0; j <= n; j++) {
				list.add(scan.nextLine());
			}

			for (int k = 0; k < list.size(); k++) {
				if (!finList.contains(list.get(k))) {
					finList.add(list.get(k));
				}
			}
			System.out.println(finList.size() - 1);
			list.clear();
			finList.clear();

		}
	}

}
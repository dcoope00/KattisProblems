import java.util.HashMap;
import java.util.Scanner;

public class secureDoors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		HashMap<String, Boolean> map = new HashMap<>();
		boolean isInside = false;
		for (int i = 0; i < n; i++) {
			String temp = scan.nextLine();
			String[] tempArray = temp.split(" ");
			String name = tempArray[1];
			String action = tempArray[0];
			if (!(map.containsKey(name))) {
				map.put(name, false);
			} else {
				map.put(name, isInside);
			}
			if (action.equals("entry")) {

				if (map.get(name) == true) {
					System.out.println(name + " entered (ANOMALY)");
				} else {
					System.out.println(name + " entered");
					isInside = true;
				}

			} else if (action.equals("exit")) {
				if (map.get(name) == true) {
					System.out.println(name + " exited");
					isInside = false;
				} else {
					System.out.println(name + " exited (ANOMALY)");
				}

			}

		}

	}

}

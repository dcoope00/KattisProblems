
import java.util.ArrayList;
import java.util.Scanner;

public class NoDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		boolean bool = false;

		String[] array = str.split(" ");
		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {

			if (!list.contains(array[i])) {
				list.add(array[i]);
				bool = false;
			} else if (list.contains(array[i])) {
				bool = true;
				break;
			}

		}
		if (bool == true) {
			System.out.println("no");
		} else
			System.out.println("yes");
	}

}

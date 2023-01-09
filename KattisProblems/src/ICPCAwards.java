
import java.util.ArrayList;
import java.util.Scanner;

public class ICPCAwards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String str = "";
		ArrayList<String> team = new ArrayList<>();
		ArrayList<String> unis = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			str = scan.nextLine();
			String[] uni = str.split(" ");

			if (!(unis.contains(uni[0]))) {
				unis.add(uni[0]);
				team.add(str);
			}

		}

		for (int i = 0; i <= 12; i++) {
			System.out.println(team.get(i));
		}

	}

}

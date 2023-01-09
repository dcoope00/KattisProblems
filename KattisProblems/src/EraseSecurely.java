import java.util.Scanner;

public class EraseSecurely {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();

		String before = scan.nextLine();
		String after = scan.nextLine();
		String temp = "";
		for (int a = 0; a < n; a++) {
			temp = "";
			for (int i = 0; i < before.length(); i++) {
				if (before.charAt(i) == '1') {
					temp += '0';
				} else {
					temp += '1';
				}
			}
			if (a == n - 1) {
				if (temp.equals(after)) {
					System.out.println("Deletion succeeded");
				} else {
					System.out.println("Deletion failed");
					
				}
				break;

			} else {
				before = temp;
			}
		}

	}

}

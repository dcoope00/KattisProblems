
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String word = scan.next();
		String alpha = scan.next();
		int lose = 10;
		int count = 0;
		int win = word.length();
		int winCount = 0;

		for (int i = 0; i < alpha.length(); i++) {
			if (word.contains(alpha.charAt(i) + "")) {
				char tmp = alpha.charAt(i);
				for (int j = 0; j < word.length(); j++) {
					if (word.charAt(j) == tmp) {
						count++;

					}
				}

			} else {
				lose--;
			}
			win -= count;
			if (lose == 0) {
				System.out.println("LOSE");
				break;
			}
			if (win == 0) {
				System.out.println("WIN");
				break;
			}

			count = 0;

		} // end i loop
	}

}

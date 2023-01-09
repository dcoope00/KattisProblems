
import java.util.Scanner;

public class HissingMicrophone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		boolean bool = false;
		String newS = "";
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == 's' && s.charAt(i + 1) == 's') {
				newS = "hiss";
				bool = true;
			}

		}

		if (bool == false) {
			newS = "no hiss";
		}
		System.out.println(newS);
	}

}
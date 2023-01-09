
import java.util.Scanner;

public class TripleTexting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String firstThird = s.substring(0, s.length() / 3);
		String secondThird = s.substring(s.length() / 3, (s.length() / 3) * 2);
		String lastThird = s.substring((s.length() / 3) * 2, s.length());
		String finalStr = "";

		if (lastThird.equals(firstThird) || lastThird.equals(secondThird)) {
			finalStr = lastThird;
		} else if (secondThird.equals(firstThird) || secondThird.equals(lastThird)) {
			finalStr = secondThird;
		} else if (firstThird.equals(secondThird) || firstThird.equals(lastThird)) {
			finalStr = lastThird;
		}

		System.out.println(finalStr);

	}

}

import java.util.Scanner;

public class Filip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		String newA = a + "";
		String newB = b + "";
		String tmpA = "";
		String tmpB = "";

		for (int i = newA.length() - 1; i >= 0; i--) {
			tmpA += newA.charAt(i) + "";
		}
		for (int i = newB.length() - 1; i >= 0; i--) {
			tmpB += newB.charAt(i) + "";
		}
		if (Integer.parseInt(tmpA) < Integer.parseInt(tmpB)) {
			System.out.println(tmpB);
		} else {
			System.out.println(tmpA);
		}
	}

}

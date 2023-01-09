
import java.util.Scanner;

public class FinalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt(); // num questions
		String[] array = new String[n];
		String[] newArray = new String[n];
		int count = 0;
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextLine(); // correct answers
		}

		for (int i = 0; i < array.length - 1; i++) {
			newArray[i] = array[i + 1];

		}

		for (int i = 0; i < newArray.length; i++) {
			String str = array[i];
			String newStr = newArray[i];
			if (str.equals(newStr)) {
				count++;
			}

		}
		System.out.println(count);

	}

}
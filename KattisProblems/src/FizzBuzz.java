
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % y == 0 && i % x == 0) {
				System.out.println("FizzBuzz");
			} else if (i % x == 0) {
				System.out.println("Fizz");
			} else if (i % y == 0) {
				System.out.println("Buzz");
			}

			else
				System.out.println(i);

		}

	}

}

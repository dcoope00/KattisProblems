import java.util.Scanner;

public class Pet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int tmpSum = 0;
		int totalSum = 0;
		int count = 0;

		int[][] grades = new int[5][4];

		for (int i = 0; i < grades.length; i++) {
			for (int j = 0; j < grades.length - 1; j++) {
				grades[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < grades.length; i++) {
			tmpSum = 0;
			for (int j = 0; j < grades.length - 1; j++) {
				tmpSum += grades[i][j];
				if (tmpSum > totalSum) {
					totalSum = tmpSum;
					count = i + 1;
				}

			}
		}
		System.out.println(count + " " + totalSum);

	}

}

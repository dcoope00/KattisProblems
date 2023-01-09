import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class YinYang {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		long startTime = System.nanoTime();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);
		String str = br.readLine();
		StringBuffer sbr = new StringBuffer(str);

		int result = 0;

		for (int i = 0; i < sbr.length() - 2; i++) {
			StringBuffer temp = new StringBuffer(sbr.substring(i, i + 3));
			int tempW = 0;
			int tempB = 0;
			for (int j = 0; j < temp.length(); j++) {

				if (temp.charAt(j) == 'W') {
					tempW++;
				} else {
					tempB++;
				}
			}
			if (tempW == tempB + 1 || tempB == tempW + 1) {
				if (tempW == 2) {
					StringBuffer tempStr = new StringBuffer(str.replace(temp, "W"));
					int tempW2 = 0;
					int tempB2 = 0;
					for (int k = 0; k < tempStr.length(); k++) {

						if (tempStr.charAt(k) == 'W') {
							tempW2++;
						} else {
							tempB2++;
						}
					}
					if (tempW2 == tempB2) {
						result = 1;
					}
				} else if (tempB == 2) {
					StringBuffer tempStr = new StringBuffer(str.replace(temp, "B"));
					int tempW2 = 0;
					int tempB2 = 0;
					for (int k = 0; k < tempStr.length(); k++) {

						if (tempStr.charAt(k) == 'W') {
							tempW2++;
						} else {
							tempB2++;
						}
					}
					if (tempW2 == tempB2) {
						result = 1;
					}
				}

			}

		}
		System.out.println(result);
//		long endTime   = System.nanoTime();
//		long totalTime = endTime - startTime;
//		System.out.println("Execution time in nanoseconds  : " + totalTime);
//		System.out.println("Execution time in milliseconds : " + totalTime / 1000000);
	}

}

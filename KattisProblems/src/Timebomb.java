import java.util.Arrays;
import java.util.Scanner;

public class Timebomb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] zero = new String[5][3];
		for (int i = 0; i < zero.length; i++) {
			for (int j = 0; j < zero[0].length; j++) {
				if (i == 0 || i == 4) {
					zero[i][j] = "*";
				} else {
					if (j == 0 || j == 2) {
						zero[i][j] = "*";
					} else {
						zero[i][j] = " ";
					}
				}

			}

		}

		String[][] one = new String[5][3];

		// do this for all matrices
		for (int i = 0; i < one.length; i++) {
			for (int j = 0; j < one[0].length; j++) {
				if (j == 2) {
					one[i][j] = "*";
				} else {
					one[i][j] = " ";
				}

			}
		}

		String[][] two = new String[5][3];
		for (int i = 0; i < two.length; i++) {
			for (int j = 0; j < two[0].length; j++) {
				if (i == 0 || i == 2 || i == 4) {
					two[i][j] = "*";
				} else {
					if (i == 1) {
						if (j == 2) {
							two[i][j] = "*";
						} else {
							two[i][j] = " ";
						}
					} else if (i == 3) {
						if (j == 0) {
							two[i][j] = "*";
						} else {
							two[i][j] = " ";
						}
					}

				}

			}
		}

		String[][] three = new String[5][3];
		for (int i = 0; i < three.length; i++) {
			for (int j = 0; j < three[0].length; j++) {
				if (i == 0 || i == 2 || i == 4) {
					three[i][j] = "*";
				} else {
					if (j == 2) {
						three[i][j] = "*";
					} else {
						three[i][j] = " ";
					}
				}

			}
		}

		String[][] four = new String[5][3];

		for (int i = 0; i < four.length; i++) {
			for (int j = 0; j < four[0].length; j++) {
				if (i == 0 || i == 1) {
					if (j == 0 || j == 2) {
						four[i][j] = "*";
					} else {
						four[i][j] = " ";
					}
				} else if (i == 2) {
					four[i][j] = "*";
				} else {
					if (j == 2) {
						four[i][j] = "*";
					} else {
						four[i][j] = " ";
					}
				}

			}
		}

		String[][] five = new String[5][3];

		for (int i = 0; i < five.length; i++) {
			for (int j = 0; j < five[0].length; j++) {
				if (i == 0 || i == 2 || i == 4) {
					five[i][j] = "*";
				} else if (i == 1) {
					if (j == 0) {
						five[i][j] = "*";
					} else {
						five[i][j] = " ";
					}
				} else if (i == 3) {
					if (j == 2) {
						five[i][j] = "*";
					} else {
						five[i][j] = " ";
					}
				}

			}
		}

		String[][] six = new String[5][3];

		for (int i = 0; i < six.length; i++) {
			for (int j = 0; j < six[0].length; j++) {
				if (i == 0 || i == 2 || i == 4) {
					six[i][j] = "*";

				} else if (i == 1) {
					if (j == 0) {
						six[i][j] = "*";
					} else {
						six[i][j] = " ";
					}
				} else if (i == 3) {
					if (j == 0 || j == 2) {
						six[i][j] = "*";
					} else {
						six[i][j] = " ";
					}
				}
			}
		}

		String[][] seven = new String[5][3];

		for (int i = 0; i < seven.length; i++) {
			for (int j = 0; j < seven[0].length; j++) {
				if (i == 0) {
					seven[i][j] = "*";
				} else {
					if (j == 2) {
						seven[i][j] = "*";
					} else {
						seven[i][j] = " ";
					}
				}

			}
		}

		String[][] eight = new String[5][3];

		for (int i = 0; i < eight.length; i++) {
			for (int j = 0; j < eight[0].length; j++) {
				if (i == 0 || i == 2 || i == 4) {
					eight[i][j] = "*";
				} else {
					if (j == 0 || j == 2) {
						eight[i][j] = "*";
					} else {
						eight[i][j] = " ";
					}
				}

			}
		}

		String[][] nine = new String[5][3];
		for (int i = 0; i < nine.length; i++) {
			for (int j = 0; j < nine[0].length; j++) {
				if (i == 0 || i == 2 || i == 4) {
					nine[i][j] = "*";
				} else if (i == 1) {
					if (j == 0 || j == 2) {
						nine[i][j] = "*";
					} else {
						nine[i][j] = " ";
					}
				} else if (i == 3) {
					if (j == 2) {
						nine[i][j] = "*";
					} else {
						nine[i][j] = " ";
					}
				}
			}
		}

		Scanner scan = new Scanner(System.in);
		String[][] temp = new String[5][3];
		String res = "";
		String str = scan.nextLine();
		String[][] bigMatrix = new String[5][str.length()];
		boolean bool = false;
		for (int i = 0; i < bigMatrix.length; i++) {
			if (i != 0) {
				str = scan.nextLine();
			}
			for (int j = 0; j < bigMatrix[0].length; j++) {
				bigMatrix[i][j] = str.charAt(j) + "";
			}

		}
		int col = 0;

		for (int i = 0; i < bigMatrix[0].length; i += 4) {
			temp = new String[5][3];
			for (int j = 0; j < bigMatrix.length; j++) {
				col = i;
				for (int k = 0; k < 3; k++) {

					temp[j][k] = bigMatrix[j][col++];
				}

			}
			if (Arrays.deepEquals(temp, zero)) {
				res += "0";
			} else if (Arrays.deepEquals(temp, one)) {
				res += "1";
			} else if (Arrays.deepEquals(temp, two)) {
				res += "2";
			} else if (Arrays.deepEquals(temp, three)) {
				res += "3";
			} else if (Arrays.deepEquals(temp, four)) {
				res += "4";
			} else if (Arrays.deepEquals(temp, five)) {
				res += "5";
			} else if (Arrays.deepEquals(temp, six)) {
				res += "6";
			} else if (Arrays.deepEquals(temp, seven)) {
				res += "7";
			} else if (Arrays.deepEquals(temp, eight)) {
				res += "8";
			} else if (Arrays.deepEquals(temp, nine)) {
				res += "9";
			} else {
				res = "BOOM!!";
				System.out.println(res);
				bool = true;
				break;
			}
		}

		if (bool == false) {
			int answer = Integer.parseInt(res);
			if (answer % 6 == 0) {
				System.out.println("BEER!!");
			}
			else {
				System.out.println("BOOM!!");
			}
		}

	}

}

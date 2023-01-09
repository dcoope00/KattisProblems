import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Prozor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] line = str.split(" " );
		int r = Integer.parseInt(line[0]);
		int s = Integer.parseInt(line[1]);
		int dim = Integer.parseInt(line[2]);
		String[][] array = new String[r][s];
		String[][] temp = new String[r][s];
		
		for(int i = 0;i < temp.length;i++) {
			String matrixLine = scan.nextLine();
			for(int j = 0;j < temp[0].length;j++) {
				temp[i][j] = matrixLine.charAt(j) + "";
				array[i][j] = temp[i][j];
				
				
			}
		}
		
//		String[][] array = { { ".", ".", ".", ".", ".", "." }, { ".", "*", ".", "*", ".", "*" },
//				{ ".", ".", ".", ".", ".", "." }, { ".", "*", ".", "*", ".", "." }, { ".", ".", "*", ".", ".", "." },
//				{ ".", ".", "*", ".", ".", "." }, { "*", ".", ".", ".", ".", "*" } };


//		String[][] temp = { { ".", ".", ".", ".", ".", "." }, { ".", "*", ".", "*", ".", "*" },
//				{ ".", ".", ".", ".", ".", "." }, { ".", "*", ".", "*", ".", "." }, { ".", ".", "*", ".", ".", "." },
//				{ ".", ".", "*", ".", ".", "." }, { "*", ".", ".", ".", ".", "*" } };

		int count = dim - 1;
		ArrayList<String[][]> matrices = new ArrayList<>();
		ArrayList<Integer> stars = new ArrayList<>();

		for (int i = 0; i < temp.length; i++) {

			for (int j = 0; j < temp[0].length; j++) {
				count = dim - 1;
				if (i + (dim - 1) < temp.length && j + (dim - 1) < temp[0].length) {

					temp[i][j] = "+";
					temp[i + dim - 1][j] = "+";
					temp[i][j + dim - 1] = "+";
					temp[i + dim - 1][j + dim - 1] = "+";
					while (count > 1) {
						temp[i + count - 1][j] = "|";
						temp[i][j + count - 1] = "-";
						temp[i + count - 1][j + dim - 1] = "|";
						temp[i + dim - 1][j + count - 1] = "-";
						count--;
					}
					int res = 0;
					for (int a = i; a < i + dim - 1; a++) {
						for (int b = j; b < j + dim - 1; b++) {
							if (temp[a][b].equals("*")) {
								res++;
							}

						}
					}
					String[][] changing = new String[temp.length][temp[0].length];
					for (int x = 0; x < changing.length; x++) {
						for (int y = 0; y < changing[0].length; y++) {
							changing[x][y] = temp[x][y];
						}
					}
					matrices.add(changing);
					stars.add(res);

					for (int a = 0; a < temp.length; a++) {
						for (int b = 0; b < temp[0].length; b++) {
							temp[a][b] = array[a][b];
						}

					}

				}

			}

		}
		int max = 0;

		for (int i = 0; i < matrices.size(); i++) {
			String[][] matrix = matrices.get(i);
			if (stars.get(i) > max) {
				max = stars.get(i);

			}

		}

		for (int i = 0; i < matrices.size(); i++) {
			String[][] matrix = matrices.get(i);
			if (stars.get(i) == max) {
				System.out.println(max);
				for (int a = 0; a < matrix.length; a++) {
					for (int b = 0; b < matrix[0].length; b++) {
						System.out.print(matrix[a][b]);
					}
					System.out.println();
				}
				break;
			}
		}

	
	}

}

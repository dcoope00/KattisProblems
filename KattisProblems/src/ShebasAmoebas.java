import java.util.Arrays;

public class ShebasAmoebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] array = { { ".", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "." },
				{ "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "#" },
				{ "#", ".", ".", "#", ".", ".", ".", "#", "#", ".", ".", "#" },
				{ "#", ".", "#", "#", ".", ".", "#", ".", ".", "#", ".", "#" },
				{ "#", ".", ".", ".", ".", ".", ".", "#", ".", "#", ".", "#" },
				{ "#", ".", ".", ".", ".", "#", ".", ".", "#", ".", ".", "#" },
				{ "#", ".", ".", ".", "#", ".", "#", ".", ".", ".", ".", "#" },
				{ "#", ".", ".", "#", ".", ".", ".", "#", ".", ".", ".", "#" },
				{ ".", "#", ".", ".", "#", ".", "#", ".", ".", ".", ".", "#" },
				{ "#", ".", ".", ".", ".", "#", ".", ".", ".", ".", ".", "#" },
				{ "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", "#", "." },
				{ ".", "#", "#", "#", "#", "#", "#", "#", "#", "#", ".", "." } };

//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[0].length; j++) {
//				System.out.print(array[i][j]);
//			}
//			System.out.println();
//		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
					if(array[i][j].equals("#")) {
						//check all neighbors
						
						
					}

			}

		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

}

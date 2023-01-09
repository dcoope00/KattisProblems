import java.util.Scanner;

public class Skener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int R = scan.nextInt();
		int C = scan.nextInt();

		int Vertical = scan.nextInt();
		int Horizontal = scan.nextInt();

		String[][] in = new String[R][C];

		for (int r = 0; r < R; r++)
			{
			String row = scan.next();
			
			for (int c = 0; c < C; c++) {
				in[r][c] = row.charAt(c) + "";
			}
			}

		for (int i = 0; i < in.length; i++) {  //increments after line has printed twice
			System.out.println("i " + i);
			for (int y = 0; y < Vertical; y++) //increments twice for each line
				{ System.out.println("y " + y);
				for (int j = 0; j < in[0].length; j++) //increments for each character in the row
					{ System.out.println("j " + j);
					for (int x = 0; x < Horizontal; x++) //increments once to print each character 
						System.out.println("x loop " + x);
					System.out.print(in[i][j]);
					System.out.println("Reset");
					}
				
				System.out.println();
				}
			}

	}

}
